package com.ym.fontdisplay.ui;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageButton;

import com.ym.fontdisplay.R;
import com.ym.fontdisplay.inerface.DialogListener;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * Created by ym on 18-1-20.
 */

public class EditDialog extends Dialog {

    private Unbinder unbinder;
    @BindView(R.id.edTv)
    EditText edTv;
    @BindView(R.id.cancel)
    ImageButton cancelBtn;
    @BindView(R.id.confirm)
    ImageButton confirmBtn;
    public String inputStr="";

    public static EditDialog sInstance;
    private Context mContext;
    DialogListener mListen=null;

    public void setGetStrBlack(DialogListener listen){
        mListen=listen;
    }


    public static EditDialog getsInstance(Context context){

        if (sInstance==null){
            sInstance=new EditDialog(context);
        }
        return  sInstance;
    }

    public EditDialog(@NonNull Context context) {
        super(context);
    }

    public EditDialog(@NonNull Context context, int themeResId) {
        super(context, themeResId);
    }

    protected EditDialog(@NonNull Context context, boolean cancelable, @Nullable OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_dialog_layout);
        unbinder= ButterKnife.bind(this);
        edTv.setSelection(edTv.getText().length());
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE);


    }
    @OnClick(R.id.confirm)
    public void confirAction(){
        inputStr=edTv.getText().toString();
        mListen.getInputStr(inputStr);
        hide();
    }
    @OnClick(R.id.cancel)
    public void cancelAction(){
        hide();
    }
    public String getInputStr(){
        return inputStr;
    }


    @Override
    public void show() {
        super.show();
    }

    @Override
    public void hide() {
        super.hide();
    }

    @Override
    public void dismiss() {
        super.dismiss();

    }
}
