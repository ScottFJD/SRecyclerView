package com.scottfu.srecyclerview;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.scottfu.srecyclerview.adapter.BaseRecyclerAdapter;
import com.scottfu.srecyclerview.adapter.CardViewAdapter;

import java.util.ArrayList;
import java.util.List;

public class CardViewActivity extends AppCompatActivity {

    private static final String TAG = "---MainActivity---";

    private RecyclerView mRecyclerView;
    private List<String> mDatas;
    private CardViewAdapter mRecyclerAdapter;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


        initDatas();
        initView();

        mRecyclerAdapter = new CardViewAdapter(this, mDatas);
        mRecyclerView.setAdapter(mRecyclerAdapter);
//      RecyclerView 的布局设置
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        mRecyclerView.setLayoutManager(linearLayoutManager);
//      item添加和删除动画
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());


//        mRecyclerAdapter.setOnItemClickListener(new BaseRecyclerAdapter.OnItemClickListener() {
//            @Override
//            public void onItemClick(View view, int position) {
//                Toast.makeText(CardViewActivity.this, "Click"+position, Toast.LENGTH_SHORT).show();
//            }
//
//            @Override
//            public void onItemLongClick(View view, int position) {
//                Toast.makeText(CardViewActivity.this, "LongClick"+position, Toast.LENGTH_SHORT).show();
//            }
//        });
//        v7-widget 中提供了DividerItemDecoration  通过android:listDivider 的属性来设置 item_divider
//        mRecyclerView.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));

    }

    private void initView() {
        mRecyclerView = (RecyclerView) findViewById(R.id.rv_content);
    }

    private void initDatas() {
        mDatas = new ArrayList<String>();
        for (int i = 'A'; i <= 'z'; i++) {
            mDatas.add(""+(char)i);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();


        switch (id) {
//            case R.id.action_add:
//                mRecyclerAdapter.addData(1);
//                return true;
//            case R.id.action_delete:
//                mRecyclerAdapter.deleteItem(1);
//                return true;
//            case R.id.action_listview:
//                mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
//                return true;
//            case R.id.action_gridview:
//                mRecyclerView.setLayoutManager(new GridLayoutManager(this,3));
//                return true;
//            case R.id.action_hor_gridview:
//                mRecyclerView.setLayoutManager(new StaggeredGridLayoutManager(5,StaggeredGridLayoutManager.HORIZONTAL));
//                return true;
//            case R.id.action_staggered:
//                Intent intent = new Intent(this, StaggeredActivity.class);
//                startActivity(intent);
//                return true;
//            case R.id.action_settings:
//                return true;
            default:
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
