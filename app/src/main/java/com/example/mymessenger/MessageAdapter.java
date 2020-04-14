package com.example.mymessenger;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class MessageAdapter extends ArrayAdapter<AwesomeMessage> {

    public MessageAdapter(@NonNull Context context, int resource, List<AwesomeMessage> messages) {
        super(context, resource, messages);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if (convertView == null){
            convertView = ((Activity)getContext()).getLayoutInflater().inflate(R.layout.message_item,parent,false);

        }

        return super.getView(position, convertView, parent);
    }
}
