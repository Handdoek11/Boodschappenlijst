package androidx.fragment.app.strictmode;

import J6.r;
import androidx.fragment.app.Fragment;

/* loaded from: classes.dex */
public final class SetTargetFragmentUsageViolation extends TargetFragmentUsageViolation {

    /* renamed from: s, reason: collision with root package name */
    private final Fragment f10120s;

    /* renamed from: t, reason: collision with root package name */
    private final int f10121t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetTargetFragmentUsageViolation(Fragment fragment, Fragment fragment2, int i8) {
        super(fragment, "Attempting to set target fragment " + fragment2 + " with request code " + i8 + " for fragment " + fragment);
        r.e(fragment, "fragment");
        r.e(fragment2, "targetFragment");
        this.f10120s = fragment2;
        this.f10121t = i8;
    }
}
