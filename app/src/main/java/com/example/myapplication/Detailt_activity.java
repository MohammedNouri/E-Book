package com.example.myapplication;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.addBook.BookRepository;

import java.util.List;

public class Detailt_activity extends AppCompatActivity {
    BookRepository repository ;
    TextView titleBook , writerBook , description;
    ImageView plus , minus,pic_Book;
    Button buy;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detailt_activty);
        initView();
        //List<String> list = new MainActivity().sendData();
        Toast.makeText(this, " exist", Toast.LENGTH_SHORT).show();
        //titleBook.setText(activity.sendData().size());
    }
    void initView(){
       titleBook = findViewById(R.id.title_book);
       writerBook = findViewById(R.id.wrtiter_book);
       description = findViewById(R.id.detailDesc);
       plus = findViewById(R.id.image_plus);
       minus = findViewById(R.id.image_minus);
       pic_Book =findViewById(R.id.pic_book);
       buy = findViewById(R.id.buy);
    }
}
