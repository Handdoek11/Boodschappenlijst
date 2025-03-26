package com.google.android.gms.common;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

/* renamed from: com.google.android.gms.common.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class DialogFragmentC1104c extends DialogFragment {

    /* renamed from: o, reason: collision with root package name */
    private Dialog f13390o;

    /* renamed from: s, reason: collision with root package name */
    private DialogInterface.OnCancelListener f13391s;

    /* renamed from: t, reason: collision with root package name */
    private Dialog f13392t;

    public static DialogFragmentC1104c a(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        DialogFragmentC1104c dialogFragmentC1104c = new DialogFragmentC1104c();
        Dialog dialog2 = (Dialog) Z2.r.m(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        dialogFragmentC1104c.f13390o = dialog2;
        if (onCancelListener != null) {
            dialogFragmentC1104c.f13391s = onCancelListener;
        }
        return dialogFragmentC1104c;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f13391s;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f13390o;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f13392t == null) {
            this.f13392t = new AlertDialog.Builder((Context) Z2.r.l(getActivity())).create();
        }
        return this.f13392t;
    }

    @Override // android.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
