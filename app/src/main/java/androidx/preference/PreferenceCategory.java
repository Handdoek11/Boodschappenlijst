package androidx.preference;

import android.R;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context, AttributeSet attributeSet, int i8, int i9) {
        super(context, attributeSet, i8, i9);
    }

    @Override // androidx.preference.Preference
    public boolean F0() {
        return !super.L();
    }

    @Override // androidx.preference.Preference
    public boolean L() {
        return false;
    }

    @Override // androidx.preference.Preference
    public void V(m mVar) {
        super.V(mVar);
        if (Build.VERSION.SDK_INT >= 28) {
            mVar.f10944a.setAccessibilityHeading(true);
        }
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet, int i8) {
        this(context, attributeSet, i8, 0);
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p0.k.a(context, n.f10552e, R.attr.preferenceCategoryStyle));
    }
}
