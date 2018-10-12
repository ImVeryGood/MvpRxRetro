package com.newdicooker.tempetek.mvprxretro;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.newdicooker.tempetek.mvprxretro.base.BaseActivity;
import com.newdicooker.tempetek.mvprxretro.bean.MovieBean;
import com.newdicooker.tempetek.mvprxretro.mvp.prestener.IPresenter;
import com.newdicooker.tempetek.mvprxretro.mvp.view.IView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends BaseActivity<IView, IPresenter> implements IView {

    @BindView(R.id.list_view)
    ListView listView;
    private List<String> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        prestener.load();

    }

    @Override
    public IPresenter creatPrestener() {
        return new IPresenter();
    }

    @Override
    public void showView(MovieBean movieBean) {
        list = new ArrayList<>();
        for (int i = 0; i < movieBean.getSubjects().size(); i++) {
            list.add(movieBean.getSubjects().get(i).getTitle());
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list);
        listView.setAdapter(adapter);

    }

    @Override
    public void ShowError(Throwable throwable) {
        Toast.makeText(this, throwable.toString(), Toast.LENGTH_SHORT).show();
        Log.d("SSSSSSSSSSS", "ShowError: " + throwable.toString());
    }

    @OnClick(R.id.rep)
    public void onViewClicked() {
        prestener.load();
    }
}
