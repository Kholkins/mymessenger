package com.example.mymessenger;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class UserListActivity extends AppCompatActivity {


    private String userName;

    private FirebaseAuth auth;
    private DatabaseReference usersDatabaseReference;
    private ChildEventListener usersChildEventListener;

    private ArrayList<User> userArrayList;
    private RecyclerView userRecyclerView;
    private UserAdapter userAdapter;
    private RecyclerView.LayoutManager userLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_list);
        
        buildRecyclerView();
        attachUserDatabaseReferenceListener();
    }

    private void attachUserDatabaseReferenceListener() {

        usersDatabaseReference = FirebaseDatabase.getInstance().getReference().child("users");
        if (usersChildEventListener == null) {

        }
    }

    private void buildRecyclerView() {
        userRecyclerView = findViewById(R.id.userListRecyclerView);
        userRecyclerView.setHasFixedSize(true);
        userLayoutManager = new LinearLayoutManager(this);
        userAdapter = new UserAdapter(userArrayList);

        userRecyclerView.setLayoutManager(userLayoutManager);
        userRecyclerView.setAdapter(userAdapter);
    }
}
