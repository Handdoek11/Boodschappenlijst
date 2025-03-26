package androidx.fragment.app.strictmode;

import J6.r;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

/* loaded from: classes.dex */
public final class FragmentTagUsageViolation extends Violation {

    /* renamed from: s, reason: collision with root package name */
    private final ViewGroup f10119s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentTagUsageViolation(Fragment fragment, ViewGroup viewGroup) {
        super(fragment, "Attempting to use <fragment> tag to add fragment " + fragment + " to container " + viewGroup);
        r.e(fragment, "fragment");
        this.f10119s = viewGroup;
    }
}
