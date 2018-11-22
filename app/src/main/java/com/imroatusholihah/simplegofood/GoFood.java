package com.imroatusholihah.simplegofood;

import android.content.Intent;
import android.opengl.ETC1;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class GoFood extends AppCompatActivity {

    ImageView imgFood;
    EditText names, alamat, order;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_go_food);

        imgFood = (ImageView) findViewById(R.id.imgGoFoodDetail);
        names = (EditText) findViewById(R.id.edt_name);
        alamat = (EditText) findViewById(R.id.edt_alamat);
        order = (EditText) findViewById(R.id.edt_pesanan);
        btnSubmit = (Button) findViewById(R.id.btn_submit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("name", names.getText().toString());
                bundle.putString("alamat", alamat.getText().toString());
                bundle.putString("order", order.getText().toString());

                Intent intent = new Intent(getApplicationContext(), SubmitOrder.class);
                intent.putExtra("name", names.getText().toString());
                intent.putExtra("alamat", alamat.getText().toString());
                intent.putExtra("order", order.getText().toString());

                startActivity(intent);
            }
        });
    }


//        String name = names.getText().toString();
//        String adress = alamat.getText().toString();
//        String pesanan = order.getText().toString();
//
//        double pemesan = Double.parseDouble(name);
//        double alamats = Double.parseDouble(adress);
//        double pesanans = Double.parseDouble(pesanan);
//
//        names.setText("pemesan");
//        alamat.setText("alamat");
//        order.setText("orderan");
}
