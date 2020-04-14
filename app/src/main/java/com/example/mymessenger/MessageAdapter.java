package com.example.mymessenger;

import android.content.Context;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;

public class MessageAdapter extends ArrayAdapter<AwesomeMessage> {

    public MessageAdapter(@NonNull Context context, int resource) {
        super(context, resource);
    }
}
