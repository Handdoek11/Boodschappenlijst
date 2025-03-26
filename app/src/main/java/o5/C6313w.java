package o5;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0906e;
import com.headcode.ourgroceries.android.C5574j1;
import com.headcode.ourgroceries.android.M2;
import com.headcode.ourgroceries.android.OurApplication;
import com.headcode.ourgroceries.android.Z0;

/* renamed from: o5.w, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C6313w extends DialogInterfaceOnCancelListenerC0906e {
    public static DialogInterfaceOnCancelListenerC0906e u2(String str) {
        C6313w c6313w = new C6313w();
        Bundle bundle = new Bundle();
        bundle.putString("categoryId", str);
        c6313w.R1(bundle);
        return c6313w;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0906e
    public Dialog k2(Bundle bundle) {
        String string = K1().getString("categoryId");
        final C5574j1 i8 = ((OurApplication) J1().getApplication()).i();
        final Z0 J7 = i8.D().J(string);
        return B.a(p(), M2.f34145o0, M2.f33992V, new DialogInterface.OnClickListener() { // from class: o5.v
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i9) {
                i8.s0(J7);
            }
        }, p().getString(M2.f34081g0, J7.E()));
    }
}
