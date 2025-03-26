package o5;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0906e;
import com.headcode.ourgroceries.android.A2;
import com.headcode.ourgroceries.android.AbstractC5625q;
import com.headcode.ourgroceries.android.D2;
import com.headcode.ourgroceries.android.G2;
import com.headcode.ourgroceries.android.I2;
import com.headcode.ourgroceries.android.M2;
import q5.AbstractC6635a;

/* loaded from: classes2.dex */
public class j0 extends DialogInterfaceOnCancelListenerC0906e {
    public static DialogInterfaceOnCancelListenerC0906e u2() {
        return new j0();
    }

    public static void v2(Context context, androidx.fragment.app.w wVar) {
        int integer = context.getResources().getInteger(I2.f33642a);
        A2 a22 = A2.f33140n0;
        int Q7 = a22.Q();
        if (integer > Q7) {
            AbstractC6635a.d("OG-WhatsNewDialog", "Showing What's New dialog because " + integer + " > " + Q7 + " or force is false");
            w2(wVar);
        }
        a22.H0(60003);
    }

    private static void w2(androidx.fragment.app.w wVar) {
        u2().r2(wVar, "unused");
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0906e
    public Dialog k2(Bundle bundle) {
        AlertDialog.Builder cancelable = new AlertDialog.Builder(L1()).setTitle(n0(M2.f34031Z6, "6.0.3")).setIcon(G2.f33459g).setMessage(M2.f34023Y6).setCancelable(true);
        final Context B7 = B();
        return ((B7 == null || !g0().getBoolean(D2.f33354a)) ? cancelable.setPositiveButton(M2.f34015X6, (DialogInterface.OnClickListener) null) : cancelable.setPositiveButton(M2.f33938O1, new DialogInterface.OnClickListener() { // from class: o5.i0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                AbstractC5625q.w(B7);
            }
        }).setNeutralButton(M2.f34015X6, (DialogInterface.OnClickListener) null)).create();
    }
}
