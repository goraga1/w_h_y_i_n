package com.whyinside.whyinside.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.innodroid.expandablerecycler.ExpandableRecyclerAdapter;
import com.whyinside.whyinside.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hayk on 06/06/2016.
 */
public class OrderHistoryAdapter extends ExpandableRecyclerAdapter<OrderHistoryAdapter.HistoryListItem> {
    public static final int TYPE_PERSON = 1001;

    public OrderHistoryAdapter(Context context) {
        super(context);
        setItems(getSampleItems());
    }

    public static class HistoryListItem extends ExpandableRecyclerAdapter.ListItem {
        public String Text;

        public HistoryListItem(String group) {
            super(TYPE_HEADER);

            Text = group;
        }

        public HistoryListItem(String first, String last) {
            super(TYPE_PERSON);

            Text = first + " " + last;
        }
    }

    public class HeaderViewHolder extends ExpandableRecyclerAdapter.HeaderViewHolder {
        TextView name;

        public HeaderViewHolder(View view) {
            super(view, (ImageView) view.findViewById(R.id.item_arrow));

            name = (TextView) view.findViewById(R.id.item_header_name);
        }

        public void bind(int position) {
            super.bind(position);

            name.setText(visibleItems.get(position).Text);
        }
    }

    public class PersonViewHolder extends ExpandableRecyclerAdapter.ViewHolder {
        TextView name;
        TextView reorder;
        public PersonViewHolder(View view) {
            super(view);

            name = (TextView) view.findViewById(R.id.item_name);
            reorder = (TextView) view.findViewById(R.id.reorder);
        }

        public void bind(int position) {
            name.setText(visibleItems.get(position).Text);
            reorder.setText("Re-Order");
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        switch (viewType) {
            case TYPE_HEADER:
                return new HeaderViewHolder(inflate(R.layout.item_history_header, parent));
            case TYPE_PERSON:
            default:
                return new PersonViewHolder(inflate(R.layout.item_history, parent));
        }
    }

    @Override
    public void onBindViewHolder(ExpandableRecyclerAdapter.ViewHolder holder, int position) {
        switch (getItemViewType(position)) {
            case TYPE_HEADER:
                ((HeaderViewHolder) holder).bind(position);
                break;
            case TYPE_PERSON:
            default:
                ((PersonViewHolder) holder).bind(position);
                break;
        }
    }

    private List<HistoryListItem> getSampleItems() {
        List<HistoryListItem> items = new ArrayList<>();

        items.add(new HistoryListItem("3 Way Restaurant"));
        items.add(new HistoryListItem("Chicharron de Pollo sin Hueso", ""));
        items.add(new HistoryListItem("Chicharron de Pollo sin Hueso", ""));
        items.add(new HistoryListItem("Chicharron de Pollo sin Hueso", ""));
        items.add(new HistoryListItem("Caridad Restaurant"));
        items.add(new HistoryListItem("Chicharron de Pollo sin Hueso", ""));
        items.add(new HistoryListItem("Chicharron de Pollo sin Hueso", ""));
        items.add(new HistoryListItem("Chicharron de Pollo sin Hueso", ""));

        return items;
    }
}
