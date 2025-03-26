package androidx.preference;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
final class b extends Preference {

    /* renamed from: f0, reason: collision with root package name */
    private long f10474f0;

    b(Context context, List list, long j8) {
        super(context);
        K0();
        L0(list);
        this.f10474f0 = j8 + 1000000;
    }

    private void K0() {
        v0(q.f10567a);
        r0(o.f10560a);
        C0(r.f10572b);
        y0(999);
    }

    private void L0(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        CharSequence charSequence = null;
        while (it.hasNext()) {
            Preference preference = (Preference) it.next();
            CharSequence H7 = preference.H();
            boolean z7 = preference instanceof PreferenceGroup;
            if (z7 && !TextUtils.isEmpty(H7)) {
                arrayList.add((PreferenceGroup) preference);
            }
            if (arrayList.contains(preference.x())) {
                if (z7) {
                    arrayList.add((PreferenceGroup) preference);
                }
            } else if (!TextUtils.isEmpty(H7)) {
                charSequence = charSequence == null ? H7 : m().getString(r.f10575e, charSequence, H7);
            }
        }
        A0(charSequence);
    }

    @Override // androidx.preference.Preference
    public void V(m mVar) {
        super.V(mVar);
        mVar.k0(false);
    }

    @Override // androidx.preference.Preference
    long s() {
        return this.f10474f0;
    }
}
