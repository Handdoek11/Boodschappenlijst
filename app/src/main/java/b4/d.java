package b4;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class d {

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f11995a;

        /* renamed from: b, reason: collision with root package name */
        private final a f11996b;

        /* renamed from: c, reason: collision with root package name */
        private a f11997c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f11998d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f11999e;

        private static class a {

            /* renamed from: a, reason: collision with root package name */
            String f12000a;

            /* renamed from: b, reason: collision with root package name */
            Object f12001b;

            /* renamed from: c, reason: collision with root package name */
            a f12002c;

            private a() {
            }
        }

        private a a() {
            a aVar = new a();
            this.f11997c.f12002c = aVar;
            this.f11997c = aVar;
            return aVar;
        }

        private b b(Object obj) {
            a().f12001b = obj;
            return this;
        }

        private static boolean d(Object obj) {
            return obj instanceof CharSequence ? ((CharSequence) obj).length() == 0 : obj instanceof Collection ? ((Collection) obj).isEmpty() : obj instanceof Map ? ((Map) obj).isEmpty() : obj instanceof g ? !((g) obj).c() : obj.getClass().isArray() && Array.getLength(obj) == 0;
        }

        public b c(Object obj) {
            return b(obj);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.String toString() {
            /*
                r8 = this;
                r0 = 1
                boolean r1 = r8.f11998d
                boolean r2 = r8.f11999e
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r4 = 32
                r3.<init>(r4)
                java.lang.String r4 = r8.f11995a
                r3.append(r4)
                r4 = 123(0x7b, float:1.72E-43)
                r3.append(r4)
                b4.d$b$a r4 = r8.f11996b
                b4.d$b$a r4 = r4.f12002c
                java.lang.String r5 = ""
            L1c:
                if (r4 == 0) goto L62
                java.lang.Object r6 = r4.f12001b
                if (r6 != 0) goto L25
                if (r1 != 0) goto L5f
                goto L2d
            L25:
                if (r2 == 0) goto L2d
                boolean r7 = d(r6)
                if (r7 != 0) goto L5f
            L2d:
                r3.append(r5)
                java.lang.String r5 = r4.f12000a
                if (r5 == 0) goto L3c
                r3.append(r5)
                r5 = 61
                r3.append(r5)
            L3c:
                if (r6 == 0) goto L5a
                java.lang.Class r5 = r6.getClass()
                boolean r5 = r5.isArray()
                if (r5 == 0) goto L5a
                java.lang.Object[] r5 = new java.lang.Object[r0]
                r7 = 0
                r5[r7] = r6
                java.lang.String r5 = java.util.Arrays.deepToString(r5)
                int r6 = r5.length()
                int r6 = r6 - r0
                r3.append(r5, r0, r6)
                goto L5d
            L5a:
                r3.append(r6)
            L5d:
                java.lang.String r5 = ", "
            L5f:
                b4.d$b$a r4 = r4.f12002c
                goto L1c
            L62:
                r0 = 125(0x7d, float:1.75E-43)
                r3.append(r0)
                java.lang.String r0 = r3.toString()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: b4.d.b.toString():java.lang.String");
        }

        private b(String str) {
            a aVar = new a();
            this.f11996b = aVar;
            this.f11997c = aVar;
            this.f11998d = false;
            this.f11999e = false;
            this.f11995a = (String) h.i(str);
        }
    }

    public static b a(Object obj) {
        return new b(obj.getClass().getSimpleName());
    }
}
