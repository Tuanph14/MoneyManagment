package com.edu.t2f.managemoney.adapters.items;


import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.edu.t2f.managemoney.R;
import com.mikepenz.fastadapter.items.AbstractItem;
import com.mikepenz.iconics.IconicsDrawable;
import com.mikepenz.iconics.view.IconicsImageView;
import com.pddstudio.pocketlibrary.models.Transaction;

import com.pddstudio.pocketutils.Preferences;


public class TransactionItem extends AbstractItem<TransactionItem, TransactionItem.ViewHolder> {

    private final Transaction transaction;

    public TransactionItem(Transaction transaction) {
        this.transaction = transaction;
    }

    @Override
    public int getType() {
        return R.id.transaction_item;
    }

    @Override
    public int getLayoutRes() {
        return R.layout.item_transaction;
    }

    @Override
    public void bindView(ViewHolder viewHolder) {
        super.bindView(viewHolder);
        //build the icon for the Transaction
        IconicsDrawable iconicsDrawable = new IconicsDrawable(viewHolder.categoryImage.getContext())
                .icon(transaction.getCategory().getCategoryIcon()).color(Color.WHITE);
        viewHolder.categoryImage.setImageDrawable(iconicsDrawable);
        viewHolder.categoryName.setText(transaction.getCategory().getCategoryName());
        //set the money value for the transaction and color the text
        viewHolder.categoryAmount.setText(transaction.getMoneyAmount() < 0 ? "-"
                + Preferences.get().getCurrencySymbol() : "+" + Preferences.get().getCurrencySymbol()
                + transaction.getMoneyAmount() + "");
        viewHolder.categoryAmount.setTextColor(transaction.getMoneyAmount() < 0 ? viewHolder.categoryImage.getContext()
                .getResources().getColor(R.color.colorAmountNegative) : viewHolder.categoryImage.getContext()
                .getResources().getColor(R.color.colorAmountPositive));
    }

    protected static class ViewHolder extends RecyclerView.ViewHolder {

        IconicsImageView categoryImage;
        TextView categoryName;
        TextView categoryAmount;

        public ViewHolder(View itemView) {
            super(itemView);
            categoryImage = (IconicsImageView) itemView.findViewById(R.id.itemCategoryImage);
            categoryName = (TextView) itemView.findViewById(R.id.itemCategoryName);
            categoryAmount = (TextView) itemView.findViewById(R.id.itemCategoryAmount);
        }

    }

}
