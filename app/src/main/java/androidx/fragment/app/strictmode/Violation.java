package androidx.fragment.app.strictmode;

import J6.r;
import androidx.fragment.app.Fragment;

/* loaded from: classes.dex */
public abstract class Violation extends RuntimeException {

    /* renamed from: o, reason: collision with root package name */
    private final Fragment f10122o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Violation(Fragment fragment, String str) {
        super(str);
        r.e(fragment, "fragment");
        this.f10122o = fragment;
    }

    public final Fragment a() {
        return this.f10122o;
    }
}
