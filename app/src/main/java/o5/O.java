package o5;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.AbstractActivityC0911j;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0906e;
import com.headcode.ourgroceries.android.C5574j1;
import com.headcode.ourgroceries.android.C5688z0;
import com.headcode.ourgroceries.android.G2;
import com.headcode.ourgroceries.android.M2;
import com.headcode.ourgroceries.android.OurApplication;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import t5.AbstractC6803e;

/* loaded from: classes2.dex */
public class O extends DialogInterfaceOnCancelListenerC0906e {

    /* renamed from: J0, reason: collision with root package name */
    private static final String[] f39909J0 = new String[0];

    public interface a {
        void B();

        void n(C5688z0 c5688z0, List list, List list2);

        void x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u2(DialogInterface dialogInterface, int i8) {
        a aVar = (a) p();
        if (aVar != null) {
            aVar.x();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v2(AlertDialog alertDialog, ArrayList arrayList, List list, List list2, DialogInterface dialogInterface, int i8) {
        int checkedItemPosition = alertDialog.getListView().getCheckedItemPosition();
        if (checkedItemPosition != -1) {
            C5688z0 c5688z0 = (C5688z0) arrayList.get(checkedItemPosition);
            a aVar = (a) p();
            if (aVar != null) {
                aVar.n(c5688z0, list, list2);
            }
        }
    }

    public static DialogInterfaceOnCancelListenerC0906e w2(List list, List list2, C5688z0 c5688z0) {
        O o8 = new O();
        Bundle bundle = new Bundle();
        String[] strArr = f39909J0;
        bundle.putStringArray("itemNames", (String[]) list.toArray(strArr));
        bundle.putStringArray("itemNotes", (String[]) list2.toArray(strArr));
        bundle.putString("defaultTargetListId", c5688z0 == null ? null : c5688z0.T());
        o8.R1(bundle);
        return o8;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0906e, androidx.fragment.app.Fragment
    public void G0(Context context) {
        super.G0(context);
        AbstractActivityC0911j J12 = J1();
        if (J12 instanceof a) {
            return;
        }
        throw new ClassCastException(J12 + " must implement ListPickerDialog.Listener");
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0906e
    public Dialog k2(Bundle bundle) {
        int i8;
        Bundle K12 = K1();
        final List asList = Arrays.asList(K12.getStringArray("itemNames"));
        final List asList2 = Arrays.asList(K12.getStringArray("itemNotes"));
        String string = K12.getString("defaultTargetListId");
        AbstractActivityC0911j J12 = J1();
        C5574j1 i9 = OurApplication.f34286H.i();
        final ArrayList arrayList = new ArrayList(10);
        i9.P(arrayList, s5.Q.SHOPPING);
        if (string != null) {
            i8 = 0;
            while (i8 < arrayList.size()) {
                if (((C5688z0) arrayList.get(i8)).T().equals(string)) {
                    break;
                }
                i8++;
            }
            i8 = 0;
        } else {
            i8 = 0;
        }
        int size = arrayList.size();
        String[] strArr = new String[size];
        for (int i10 = 0; i10 < size; i10++) {
            strArr[i10] = ((C5688z0) arrayList.get(i10)).W();
        }
        final AlertDialog create = new AlertDialog.Builder(J12).setTitle(J12.getString(M2.f34193u0, AbstractC6803e.r(asList, Locale.getDefault()))).setIcon(G2.f33459g).setSingleChoiceItems(strArr, i8, (DialogInterface.OnClickListener) null).setNegativeButton(M2.f34024Z, new DialogInterface.OnClickListener() { // from class: o5.M
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                this.f39903o.u2(dialogInterface, i11);
            }
        }).create();
        create.setButton(-1, J12.getString(M2.f33960R), new DialogInterface.OnClickListener() { // from class: o5.N
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                this.f39904o.v2(create, arrayList, asList, asList2, dialogInterface, i11);
            }
        });
        return create;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0906e, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        a aVar = (a) p();
        if (aVar != null) {
            aVar.x();
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0906e, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        a aVar = (a) p();
        if (aVar != null) {
            aVar.B();
        }
    }
}
