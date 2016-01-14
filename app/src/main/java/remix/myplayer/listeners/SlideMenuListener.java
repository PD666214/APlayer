package remix.myplayer.listeners;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.CursorAdapter;
import android.widget.Toast;
import org.xmlpull.v1.*;
import remix.myplayer.R;
import remix.myplayer.activities.MainActivity;
import remix.myplayer.fragments.MainFragment;
import remix.myplayer.utils.Utility;

/**
 * Created by Remix on 2015/12/10.
 */
public class SlideMenuListener implements AdapterView.OnItemClickListener {
    private Context mContext;

    public SlideMenuListener(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch (view.getId()) {
            case 0:
                Toast.makeText(mContext, "关于软件", Toast.LENGTH_SHORT).show();
                break;
            case 1:
                Toast.makeText(mContext, "搜索", Toast.LENGTH_SHORT).show();
                break;
            case 2:
                Intent intent = new Intent(Utility.CTL_ACTION);
                intent.putExtra("Control", Utility.PREV);
                mContext.sendBroadcast(intent);
                break;
            case 3:
//                MainActivity.loadsongs();
//                MainFragment.mInstance.getAdapter().notifyDataSetChanged();
                Toast.makeText(mContext, "刷新成功!", Toast.LENGTH_SHORT).show();
                break;
            case 4:
                MainActivity.mInstance.finish();
                break;
        }
    }
}
