package com.imroatusholihah.simplegofood;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class SubmitOrder extends AppCompatActivity {

    ImageView foodLogo;
    TextView nameOrder, adressOrder, ordeOrder;
    Button btnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submit_order);

        foodLogo = (ImageView) findViewById(R.id.imgGoFoodDetail);
        nameOrder = (TextView) findViewById(R.id.ro_name_pemesan);
        adressOrder = (TextView) findViewById(R.id.ro_alamat_pemesan);
        ordeOrder = (TextView) findViewById(R.id.ro_item_pemesan);

        if (getIntent().getExtras() != null){
            Bundle bundle = getIntent().getExtras();
            nameOrder.setText(bundle.getString("name"));
            adressOrder.setText(bundle.getString("alamat"));
            ordeOrder.setText(bundle.getString("order"));
        } else {
            nameOrder.setText(getIntent().getStringExtra("name"));
            adressOrder.setText(getIntent().getStringExtra("alamat"));
            ordeOrder.setText(getIntent().getStringExtra("order"));
        }

        btnCancel = (Button) findViewById(R.id.btn_cancel);
        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent main = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(main);
            }
        });

    }
}
