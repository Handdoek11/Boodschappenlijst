package androidx.fragment.app.strictmode;

import J6.r;
import androidx.fragment.app.Fragment;

/* loaded from: classes.dex */
public final class FragmentReuseViolation extends Violation {

    /* renamed from: s, reason: collision with root package name */
    private final String f10118s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentReuseViolation(Fragment fragment, String str) {
        super(fragment, "Attempting to reuse fragment " + fragment + " with previous ID " + str);
        r.e(fragment, "fragment");
        r.e(str, "previousFragmentId");
        this.f10118s = str;
    }
}
