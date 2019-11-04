package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener,PopupMenu.OnMenuItemClickListener {
//public class MainActivity extends AppCompatActivity {
    final static int MENU_00 = Menu.FIRST;
    final static int MENU_01 = Menu.FIRST+1;
    private String[] data={"zff","zxy","hzq"};
    private List<Student> studentList = new ArrayList<>();
    private Button button1;

    //选项菜单//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        initStudents();
//    }
//
//    public boolean onCreateOptionsMenu(Menu menu){
//        menu.add(0,MENU_00,0,"打印");
//        menu.add(0,MENU_01,1,"新建");
//        MenuInflater inflater = new MenuInflater(this);
//        inflater.inflate(R.menu.menu_main,menu);
//        super.onCreateOptionsMenu(menu);
//        return true;
//    }
//
//    public boolean onOptionsItemSelected(MenuItem item){
//        switch (item.getItemId()){
//            case R.id.help:
//                Toast.makeText(MainActivity.this,"这是帮助区",Toast.LENGTH_SHORT).show();
//                break;
//            case R.id.tran:
//                Intent intent = new Intent();
//                intent.setClass(MainActivity.this, tran.class);
//                startActivity(intent);
//                break;
//
//        }
//        return true;
//    }
//
//
//    private void initStudents(){
//        for (int i=0; i<1; i++){
//            Student zff = new Student("ZFF");
//            studentList.add(zff);
//
//            Student zxy = new Student("ZXY");
//            studentList.add(zxy);
//
//            Student hzq = new Student("HZQ");
//            studentList.add(hzq);
//        }
//    }
    //选项菜单over//



    //上下文菜单//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        initStudents();
//        idem adapter = new idem(MainActivity.this,R.layout.listview_main,studentList);
//        ListView listView = (ListView) findViewById(R.id.list_view);
//        listView.setAdapter(adapter);
//        registerForContextMenu(listView);
//
//    }
//
//    @Override
//    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo){
//        super.onCreateContextMenu(menu, v, menuInfo);
//        MenuInflater inflater = getMenuInflater();
//        inflater.inflate(R.menu.menu_main, menu);
//    }
//
//    @Override
//    public boolean onContextItemSelected(MenuItem item) {
//        switch(item.getItemId()){
//            case R.id.action_settings:
//                Toast.makeText(this,"settings",Toast.LENGTH_SHORT).show();
//                break;
//            case R.id.help:
//                Toast.makeText(MainActivity.this,"这是帮助区",Toast.LENGTH_SHORT).show();
//                break;
//            case R.id.tran:
//                Intent intent = new Intent();
//                intent.setClass(MainActivity.this, tran.class);
//                startActivity(intent);
//                break;
//        }
//        return true;
//    }
//
//    private void initStudents(){
//        for (int i=0; i<1; i++){
//            Student zff = new Student("ZFF");
//            studentList.add(zff);
//
//            Student zxy = new Student("ZXY");
//            studentList.add(zxy);
//
//            Student hzq = new Student("HZQ");
//            studentList.add(hzq);
//        }
//    }
    //上下文菜单over//



    //弹出菜单//
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tanchu_main);
        button1 = (Button) findViewById(R.id.button);
        button1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        PopupMenu popup = new PopupMenu(this,v);
        MenuInflater inflater = popup.getMenuInflater();
        inflater.inflate(R.menu.menu_main, popup.getMenu());
        popup.setOnMenuItemClickListener(this);
        popup.show();
    }

    @Override
    public boolean onMenuItemClick(MenuItem menuItem){
        switch(menuItem.getItemId()){
            case R.id.help:
                Toast.makeText(MainActivity.this,"这是帮助区",Toast.LENGTH_SHORT).show();
                break;
            case R.id.tran:
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, tran.class);
                startActivity(intent);
                break;
        }
        return false;
    }
    //弹出菜单over//

}
