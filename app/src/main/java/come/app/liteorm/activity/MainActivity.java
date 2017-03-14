package come.app.liteorm.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import come.app.liteorm.R;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.recycler)
    RecyclerView recycler;
    @BindView(R.id.add)
    Button add;
    @BindView(R.id.delete)
    Button delete;
    @BindView(R.id.update)
    Button update;
    @BindView(R.id.queary)
    Button queary;

    /**
     * RecyclerView 使用
     * https://github.com/CymChad/BaseRecyclerViewAdapterHelper/wiki/首页
     * <p>
     * 优化adapter
     * <p>
     * 添加item 点击事件
     * 长按事件
     * <p>
     * 子控件点击事件
     * 子控件长按事件
     * <p>
     * 添加 列表加载 动画   5 种默认动画
     * 添加 头部、尾部
     * 上拉加载   上拉加载无需监听滑动事件,可自定义加载布局，显示异常提示，自定义异常提示。
     * 添加分组
     * 自定义不同的 item类型
     * 设置空布局
     * <p>
     * <p>
     * 数据库lite_orm
     */


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


    }

    @OnClick({R.id.add, R.id.delete, R.id.update, R.id.queary})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.add:
                break;
            case R.id.delete:
                break;
            case R.id.update:
                break;
            case R.id.queary:
                break;
        }
    }
}
