package androidx.fragment.app.strictmode;

import J6.r;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

/* loaded from: classes.dex */
public final class WrongFragmentContainerViolation extends Violation {

    /* renamed from: s, reason: collision with root package name */
    private final ViewGroup f10123s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WrongFragmentContainerViolation(Fragment fragment, ViewGroup viewGroup) {
        super(fragment, "Attempting to add fragment " + fragment + " to container " + viewGroup + " which is not a FragmentContainerView");
        r.e(fragment, "fragment");
        r.e(viewGroup, "container");
        this.f10123s = viewGroup;
    }
}
