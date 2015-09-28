package com.example.dell.learnerintermediate;

/**
 * Created by ucsc on 9/25/2015.
 */
import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.dell.learnerintermediate.DynamicArrayAdapter;
import com.example.dell.learnerintermediate.DynamicListView;

import java.util.List;

public class Lesson15DListAdapter extends DynamicArrayAdapter<String> {

    private static final int LAYOUT = R.layout.row_layout_less_15_;

    List<String> objects;
    DynamicListView listView;

    public Lesson15DListAdapter(Context context, List<String> objects) {
        super(context, LAYOUT, objects);
        this.objects = objects;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        View row = convertView;
        Holder holder;

        Resources r = getContext().getResources();
        if(row == null) {
            LayoutInflater inflater = LayoutInflater.from(getContext());

            row = inflater.inflate(LAYOUT, parent, false);
            holder = new Holder();

            holder.text = (TextView)row.findViewById(R.id.text1);
            holder.dragView = row.findViewById(R.id.gripview);

            row.setTag(holder);
        } else {
            holder = (Holder)row.getTag();
        }

        holder.text.setText(getItem(position));
        holder.dragView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                return onRowDragViewTouch(position);
            }
        });

        return row;
    }

    public void bindToListView(DynamicListView lv) {
        listView = lv;
        listView.setDynamicAdapter(this);
    }

    @Override
    protected void doItemSwap(int pos1, int pos2) {
        String o1 = objects.get(pos1);
        String o2 = objects.get(pos2);
        objects.set(pos1, o2);
        objects.set(pos2, o1);
    }

    private boolean onRowDragViewTouch(int position) {
        if (listView.canHoverRows()) {
            // The row clicked is now placed above the other rows, and follows the touch position
            listView.hoverRow(position);
            return true;
        }
        return false;
    }

    private static class Holder {
        TextView text;
        View dragView;
    }


}

