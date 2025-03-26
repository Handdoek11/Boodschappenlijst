package o5;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.fragment.app.AbstractActivityC0911j;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0906e;
import com.headcode.ourgroceries.android.AbstractC5673x;
import com.headcode.ourgroceries.android.G2;
import com.headcode.ourgroceries.android.H2;
import com.headcode.ourgroceries.android.M2;
import com.headcode.ourgroceries.android.P1;

/* loaded from: classes2.dex */
public class Z extends DialogInterfaceOnCancelListenerC0906e {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void v2(SharedPreferences sharedPreferences, String str, DialogInterface dialogInterface, int i8) {
        AbstractC5673x.a("ratingNagNo");
        sharedPreferences.edit().putLong(str, Long.MAX_VALUE).apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void w2(SharedPreferences sharedPreferences, String str, long j8, DialogInterface dialogInterface, int i8) {
        AbstractC5673x.a("ratingNagLater");
        sharedPreferences.edit().putLong(str, j8).apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void x2(SharedPreferences sharedPreferences, String str, AbstractActivityC0911j abstractActivityC0911j, DialogInterface dialogInterface, int i8) {
        AbstractC5673x.a("ratingNagYes");
        sharedPreferences.edit().putLong(str, Long.MAX_VALUE).apply();
        P1.X(abstractActivityC0911j.findViewById(H2.f33608q1), abstractActivityC0911j, "rate_us_nag");
    }

    public static void y2(AbstractActivityC0911j abstractActivityC0911j, long j8) {
        Z z7 = new Z();
        Bundle bundle = new Bundle();
        bundle.putLong("laterTime", j8);
        z7.R1(bundle);
        try {
            z7.r2(abstractActivityC0911j.getSupportFragmentManager(), "unused");
        } catch (IllegalStateException unused) {
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0906e
    public Dialog k2(Bundle bundle) {
        final AbstractActivityC0911j J12 = J1();
        final SharedPreferences b8 = androidx.preference.k.b(J12);
        final String string = J12.getString(M2.f34028Z3);
        final long j8 = K1().getLong("laterTime");
        return new AlertDialog.Builder(J12).setIcon(G2.f33459g).setTitle(M2.f34012X3).setMessage(M2.f34004W3).setNegativeButton(M2.f33996V3, new DialogInterface.OnClickListener() { // from class: o5.W
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                Z.v2(b8, string, dialogInterface, i8);
            }
        }).setNeutralButton(M2.f33988U3, new DialogInterface.OnClickListener() { // from class: o5.X
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                Z.w2(b8, string, j8, dialogInterface, i8);
            }
        }).setPositiveButton(M2.f34020Y3, new DialogInterface.OnClickListener() { // from class: o5.Y
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                Z.x2(b8, string, J12, dialogInterface, i8);
            }
        }).create();
    }
}
