package W;

import J6.AbstractC0650j;
import t.M;

/* loaded from: classes.dex */
public interface z extends M {
    boolean b();

    public static final class a implements z {

        /* renamed from: o, reason: collision with root package name */
        private final Object f5802o;

        /* renamed from: s, reason: collision with root package name */
        private final boolean f5803s;

        public a(Object obj, boolean z7) {
            this.f5802o = obj;
            this.f5803s = z7;
        }

        @Override // W.z
        public boolean b() {
            return this.f5803s;
        }

        @Override // t.M
        public Object getValue() {
            return this.f5802o;
        }

        public /* synthetic */ a(Object obj, boolean z7, int i8, AbstractC0650j abstractC0650j) {
            this(obj, (i8 & 2) != 0 ? true : z7);
        }
    }
}
