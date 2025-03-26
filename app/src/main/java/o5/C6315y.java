package o5;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.AbstractActivityC0911j;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0906e;
import com.headcode.ourgroceries.android.C5574j1;
import com.headcode.ourgroceries.android.C5688z0;
import com.headcode.ourgroceries.android.G2;
import com.headcode.ourgroceries.android.M2;
import com.headcode.ourgroceries.android.OurApplication;
import com.headcode.ourgroceries.android.Z0;

/* renamed from: o5.y, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C6315y extends DialogInterfaceOnCancelListenerC0906e {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void t2(C5688z0 c5688z0, Z0 z02, C5574j1 c5574j1, OurApplication ourApplication, DialogInterface dialogInterface, int i8) {
        if (c5688z0 == null || z02 == null) {
            return;
        }
        c5574j1.v0(c5688z0, z02);
        m5.D.l(ourApplication.o(), c5688z0, z02.E());
    }

    public static DialogInterfaceOnCancelListenerC0906e u2(C5688z0 c5688z0, Z0 z02) {
        C6315y c6315y = new C6315y();
        Bundle bundle = new Bundle();
        bundle.putString("listId", c5688z0.T());
        bundle.putString("listName", c5688z0.W());
        bundle.putString("itemId", z02.w());
        bundle.putString("itemTitle", z02.E());
        c6315y.R1(bundle);
        return c6315y;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0906e
    public Dialog k2(Bundle bundle) {
        String string = K1().getString("listId");
        String string2 = K1().getString("listName");
        String string3 = K1().getString("itemId");
        String string4 = K1().getString("itemTitle");
        AbstractActivityC0911j J12 = J1();
        final OurApplication ourApplication = (OurApplication) J12.getApplication();
        final C5574j1 i8 = ourApplication.i();
        final C5688z0 x7 = i8.x(string);
        final Z0 J7 = x7 == null ? null : x7.J(string3);
        return new AlertDialog.Builder(J12).setTitle(M2.f34153p0).setIcon(G2.f33459g).setMessage(J12.getString(M2.f34089h0, string4, string2)).setPositiveButton(M2.f34000W, new DialogInterface.OnClickListener() { // from class: o5.x
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i9) {
                C6315y.t2(x7, J7, i8, ourApplication, dialogInterface, i9);
            }
        }).setNegativeButton(M2.f33984U, (DialogInterface.OnClickListener) null).create();
    }
}
