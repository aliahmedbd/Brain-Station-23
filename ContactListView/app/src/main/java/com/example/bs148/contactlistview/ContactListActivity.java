package com.example.bs148.contactlistview;

import android.app.Activity;
import android.content.ContentResolver;
import android.database.Cursor;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class ContactListActivity extends AppCompatActivity {
    ArrayList<User> list;
    String phoneNumber;
    RecyclerView rec_contact_list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_list);
        list = new ArrayList<User>();
        rec_contact_list = (RecyclerView)findViewById(R.id.rec_contact_list);
        getNumber(this.getContentResolver());
    }

    public void getNumber(ContentResolver cr)
    {
        Cursor phones = cr.query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null,null,null, null);
        while (phones.moveToNext())
        {
            String name=phones.getString(phones.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME));
            phoneNumber = phones.getString(phones.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER));
            User user = new User(this);
            user.setName(name);
            user.setPhoneNumber(phoneNumber);
            list.add(user);
        }
        phones.close();// close cursor
        CustomAdapter customAdapter = new CustomAdapter(list);
        rec_contact_list.setLayoutManager(new LinearLayoutManager(this));
        rec_contact_list.setAdapter(customAdapter);

    }

}
