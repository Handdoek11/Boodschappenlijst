package com.google.android.gms.common;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0906e;

/* loaded from: classes.dex */
public class l extends DialogInterfaceOnCancelListenerC0906e {

    /* renamed from: J0, reason: collision with root package name */
    private Dialog f13420J0;

    /* renamed from: K0, reason: collision with root package name */
    private DialogInterface.OnCancelListener f13421K0;

    /* renamed from: L0, reason: collision with root package name */
    private Dialog f13422L0;

    public static l s2(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        l lVar = new l();
        Dialog dialog2 = (Dialog) Z2.r.m(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        lVar.f13420J0 = dialog2;
        if (onCancelListener != null) {
            lVar.f13421K0 = onCancelListener;
        }
        return lVar;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0906e
    public Dialog k2(Bundle bundle) {
        Dialog dialog = this.f13420J0;
        if (dialog != null) {
            return dialog;
        }
        p2(false);
        if (this.f13422L0 == null) {
            this.f13422L0 = new AlertDialog.Builder((Context) Z2.r.l(B())).create();
        }
        return this.f13422L0;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0906e, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f13421K0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0906e
    public void r2(androidx.fragment.app.w wVar, String str) {
        super.r2(wVar, str);
    }
}
