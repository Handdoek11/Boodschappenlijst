package o5;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.AbstractActivityC0911j;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0906e;
import com.headcode.ourgroceries.android.AbstractC5625q;
import com.headcode.ourgroceries.android.M2;
import com.headcode.ourgroceries.android.P1;
import s5.EnumC6750p;

/* renamed from: o5.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C6305n extends DialogInterfaceOnCancelListenerC0906e {

    /* renamed from: o5.n$a */
    public interface a {
        void C(String str, EnumC6750p enumC6750p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u2(String str, DialogInterface dialogInterface, int i8) {
        AbstractC5625q.h(p(), str, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v2(String str, EnumC6750p enumC6750p, DialogInterface dialogInterface, int i8) {
        ((a) p()).C(str, enumC6750p);
    }

    public static DialogInterfaceOnCancelListenerC0906e w2(String str, String str2, EnumC6750p enumC6750p) {
        C6305n c6305n = new C6305n();
        Bundle bundle = new Bundle();
        bundle.putString("listId", str);
        bundle.putString("barcode", str2);
        bundle.putSerializable("barcodeType", enumC6750p);
        c6305n.R1(bundle);
        return c6305n;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0906e, androidx.fragment.app.Fragment
    public void G0(Context context) {
        super.G0(context);
        AbstractActivityC0911j J12 = J1();
        if (J12 instanceof a) {
            return;
        }
        throw new ClassCastException(J12 + " must implement BarcodeNetworkErrorDialog.Listener");
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0906e
    public Dialog k2(Bundle bundle) {
        Bundle K12 = K1();
        final String string = K12.getString("listId");
        final String string2 = K12.getString("barcode");
        final EnumC6750p enumC6750p = (EnumC6750p) P1.s(K12, "barcodeType", EnumC6750p.class);
        return new AlertDialog.Builder(J1()).setMessage(M2.f34042b1).setNegativeButton(M2.f34034a1, new DialogInterface.OnClickListener() { // from class: o5.l
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                this.f39950o.u2(string, dialogInterface, i8);
            }
        }).setPositiveButton(M2.f34050c1, new DialogInterface.OnClickListener() { // from class: o5.m
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                this.f39952o.v2(string2, enumC6750p, dialogInterface, i8);
            }
        }).setCancelable(true).create();
    }
}
