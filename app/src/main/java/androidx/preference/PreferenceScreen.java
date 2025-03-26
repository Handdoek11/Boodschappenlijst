package androidx.preference;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import androidx.preference.k;

/* loaded from: classes.dex */
public final class PreferenceScreen extends PreferenceGroup {

    /* renamed from: n0, reason: collision with root package name */
    private boolean f10437n0;

    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, p0.k.a(context, n.f10554g, R.attr.preferenceScreenStyle));
        this.f10437n0 = true;
    }

    @Override // androidx.preference.PreferenceGroup
    protected boolean R0() {
        return false;
    }

    @Override // androidx.preference.Preference
    protected void W() {
        k.b g8;
        if (t() != null || r() != null || Q0() == 0 || (g8 = D().g()) == null) {
            return;
        }
        g8.h(this);
    }

    public boolean W0() {
        return this.f10437n0;
    }
}
