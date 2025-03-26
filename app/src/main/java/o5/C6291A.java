package o5;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.AbstractActivityC0911j;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0906e;
import com.headcode.ourgroceries.android.C5574j1;
import com.headcode.ourgroceries.android.C5688z0;
import com.headcode.ourgroceries.android.M2;
import com.headcode.ourgroceries.android.OurApplication;
import com.headcode.ourgroceries.android.P1;

/* renamed from: o5.A, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C6291A extends DialogInterfaceOnCancelListenerC0906e {

    /* renamed from: o5.A$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f39882a;

        static {
            int[] iArr = new int[s5.Q.values().length];
            f39882a = iArr;
            try {
                iArr[s5.Q.RECIPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f39882a[s5.Q.SHOPPING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void t2(C5688z0 c5688z0, C5574j1 c5574j1, DialogInterface dialogInterface, int i8) {
        if (c5688z0 != null) {
            c5574j1.v(c5688z0);
        }
    }

    public static DialogInterfaceOnCancelListenerC0906e u2(C5688z0 c5688z0) {
        return v2(c5688z0.T(), c5688z0.U(), c5688z0.W());
    }

    public static DialogInterfaceOnCancelListenerC0906e v2(String str, s5.Q q8, String str2) {
        C6291A c6291a = new C6291A();
        Bundle bundle = new Bundle();
        bundle.putString("listId", str);
        bundle.putSerializable("listType", q8);
        bundle.putString("listName", str2);
        c6291a.R1(bundle);
        return c6291a;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0906e
    public Dialog k2(Bundle bundle) {
        int i8;
        int i9;
        Bundle K12 = K1();
        String string = K12.getString("listId");
        s5.Q q8 = (s5.Q) P1.s(K12, "listType", s5.Q.class);
        String string2 = K12.getString("listName");
        AbstractActivityC0911j J12 = J1();
        final C5574j1 i10 = ((OurApplication) J12.getApplication()).i();
        final C5688z0 x7 = i10.x(string);
        if (a.f39882a[q8.ordinal()] != 1) {
            i8 = M2.f34161q0;
            i9 = M2.f34008X;
        } else {
            i8 = M2.f34169r0;
            i9 = M2.f34016Y;
        }
        return B.a(J12, i8, i9, new DialogInterface.OnClickListener() { // from class: o5.z
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                C6291A.t2(x7, i10, dialogInterface, i11);
            }
        }, J12.getString(M2.f34097i0, string2));
    }
}
