package come.app.liteorm.adapter;

import android.net.wifi.WifiConfiguration;
import android.os.AsyncTask;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

import come.app.liteorm.R;
import come.app.liteorm.entitys.Student;

/**
 * Created by Administrator on 2017/3/7.
 */

public class QuickAdapter extends BaseQuickAdapter<Student,BaseViewHolder>{


    public  QuickAdapter(List<Student> mlist){
       super(R.layout.item,mlist);
    }
    @Override
    protected void convert(BaseViewHolder helper, Student item) {

    }


}
