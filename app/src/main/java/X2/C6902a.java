package x2;

import android.text.TextUtils;
import java.util.List;
import w2.AbstractC6875a;
import w2.C6881g;

/* renamed from: x2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6902a extends C6881g {
    /* synthetic */ C6902a(C0348a c0348a, AbstractC6906e abstractC6906e) {
        super(c0348a);
    }

    /* renamed from: x2.a$a, reason: collision with other inner class name */
    public static final class C0348a extends AbstractC6875a {
        public C0348a g(String str, List list) {
            if (list != null) {
                this.f44252a.p(str, TextUtils.join(",", list));
            }
            return this;
        }

        public C6902a h() {
            return new C6902a(this, null);
        }

        @Override // w2.AbstractC6875a
        public final /* bridge */ /* synthetic */ AbstractC6875a c() {
            return this;
        }
    }
}
