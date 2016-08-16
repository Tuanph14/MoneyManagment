package com.edu.t2f.managemoney.adapters.items;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.edu.t2f.managemoney.R;
import com.mikepenz.fastadapter.items.AbstractItem;
import com.mikepenz.iconics.IconicsDrawable;
import com.pddstudio.pocketlibrary.models.Category;


public class CategoryItem extends AbstractItem<CategoryItem, CategoryItem.ViewHolder> {

    private final Category category;

    public CategoryItem(Category category) {
        this.category = category;
    }

    public Category getCategory() {
        return category;
    }

    @Override
    public int getType() {
        return R.id.category_item;
    }

    @Override
    public int getLayoutRes() {
        return R.layout.item_category;
    }

    @Override
    public void bindView(ViewHolder viewHolder) {
        super.bindView(viewHolder);
        // configure the item
        IconicsDrawable iconicsDrawable = new IconicsDrawable(viewHolder.categoryImage.getContext())
                .icon(category.getCategoryIcon()).color(Color.WHITE);
        viewHolder.categoryImage.setImageDrawable(iconicsDrawable);
    }

    protected static class ViewHolder extends RecyclerView.ViewHolder {

        protected ImageView categoryImage;

        public ViewHolder(View itemView) {
            super(itemView);
            categoryImage = (ImageView) itemView.findViewById(R.id.categoryImage);
        }
    }
}
