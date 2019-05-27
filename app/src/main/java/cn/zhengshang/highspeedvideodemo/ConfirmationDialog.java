package cn.zhengshang.highspeedvideodemo;


import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatDialogFragment;

public class ConfirmationDialog extends AppCompatDialogFragment {
    private static final String KEY_MSG_ID = "MSG_ID";

    private DialogInterface.OnClickListener mOkListener;
    private DialogInterface.OnClickListener mCancelListener;

    public static ConfirmationDialog newInstance(@StringRes int msgId) {

        Bundle args = new Bundle();
        args.putInt(KEY_MSG_ID, msgId);

        ConfirmationDialog fragment = new ConfirmationDialog();
        fragment.setArguments(args);
        return fragment;
    }


    public ConfirmationDialog setOkListener(DialogInterface.OnClickListener okListener) {
        mOkListener = okListener;
        return this;
    }

    public ConfirmationDialog setCancelListener(DialogInterface.OnClickListener cancelListener) {
        mCancelListener = cancelListener;
        return this;
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        return new AlertDialog.Builder(getActivity())
                .setMessage(getArguments().getInt(KEY_MSG_ID))
                .setPositiveButton(android.R.string.ok, mOkListener)
                .setNegativeButton(android.R.string.cancel, mCancelListener)
                .create();
    }

}
