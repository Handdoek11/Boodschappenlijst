package o5;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.AbstractActivityC0911j;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0906e;
import com.headcode.ourgroceries.android.AbstractC5604n;
import com.headcode.ourgroceries.android.G2;
import com.headcode.ourgroceries.android.M2;

/* renamed from: o5.u, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C6311u extends DialogInterfaceOnCancelListenerC0906e {
    public static DialogInterfaceOnCancelListenerC0906e u2(AbstractC5604n.g gVar, boolean z7) {
        C6311u c6311u = new C6311u();
        Bundle bundle = new Bundle();
        bundle.putBundle("invitation", gVar.f());
        bundle.putBoolean("hasExistingAccount", z7);
        c6311u.R1(bundle);
        return c6311u;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0906e
    public Dialog k2(Bundle bundle) {
        String string;
        int i8;
        final boolean z7;
        final AbstractActivityC0911j J12 = J1();
        Bundle K12 = K1();
        final AbstractC5604n.g a8 = AbstractC5604n.g.a(K12.getBundle("invitation"));
        if (K12.getBoolean("hasExistingAccount")) {
            string = J12.getString(M2.f34067e2, a8.c());
            i8 = M2.f34075f2;
            z7 = false;
        } else {
            string = J12.getString(M2.f34051c2, a8.c());
            i8 = M2.f34059d2;
            z7 = true;
        }
        AlertDialog create = new AlertDialog.Builder(J12).setTitle(M2.f34107j2).setIcon(G2.f33459g).setMessage(string).setNegativeButton(M2.f33906K1, (DialogInterface.OnClickListener) null).setPositiveButton(i8, new DialogInterface.OnClickListener() { // from class: o5.t
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i9) {
                AbstractC5604n.e(a8, z7, J12, null);
            }
        }).setCancelable(true).create();
        create.setCanceledOnTouchOutside(false);
        return create;
    }
}
