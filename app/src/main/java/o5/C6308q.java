package o5;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.AbstractActivityC0911j;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0906e;
import com.headcode.ourgroceries.android.AbstractC5673x;
import com.headcode.ourgroceries.android.M2;

/* renamed from: o5.q, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C6308q extends DialogInterfaceOnCancelListenerC0906e {

    /* renamed from: o5.q$a */
    public interface a {
        void u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void v2(AbstractActivityC0911j abstractActivityC0911j, DialogInterface dialogInterface, int i8) {
        AbstractC5673x.a("delAllConfirm");
        ((a) abstractActivityC0911j).u();
    }

    public static DialogInterfaceOnCancelListenerC0906e w2() {
        return new C6308q();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0906e, androidx.fragment.app.Fragment
    public void G0(Context context) {
        super.G0(context);
        AbstractActivityC0911j J12 = J1();
        if (J12 instanceof a) {
            return;
        }
        throw new ClassCastException(J12 + " must implement ConfirmDeleteAllCrossedOffDialog.Listener");
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0906e
    public Dialog k2(Bundle bundle) {
        final AbstractActivityC0911j J12 = J1();
        AbstractC5673x.a("delAll");
        return new AlertDialog.Builder(J12).setMessage(M2.f34146o1).setNegativeButton(M2.f34130m1, new DialogInterface.OnClickListener() { // from class: o5.o
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                AbstractC5673x.a("delAllCancel");
            }
        }).setPositiveButton(M2.f34138n1, new DialogInterface.OnClickListener() { // from class: o5.p
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                C6308q.v2(J12, dialogInterface, i8);
            }
        }).setCancelable(true).create();
    }
}
