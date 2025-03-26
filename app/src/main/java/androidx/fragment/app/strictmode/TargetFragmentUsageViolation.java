package androidx.fragment.app.strictmode;

import J6.r;
import androidx.fragment.app.Fragment;

/* loaded from: classes.dex */
public abstract class TargetFragmentUsageViolation extends Violation {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TargetFragmentUsageViolation(Fragment fragment, String str) {
        super(fragment, str);
        r.e(fragment, "fragment");
    }
}
