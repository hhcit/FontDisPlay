package com.ym.fontdisplay.ui;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.widget.EditText;
import android.widget.ImageButton;

import com.ym.fontdisplay.R;

import butterknife.BindView;

/**
 * Created by ym on 18-1-20.
 */

public class EditDialog extends Dialog {

    @BindView(R.id.edTv)
    EditText edTv;
    @BindView(R.id.imgBtn)
    ImageButton imgBtn;

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

    }
}
