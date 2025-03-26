package u5;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private final c f44024a = new c();

    /* renamed from: b, reason: collision with root package name */
    final int f44025b;

    public enum b {
        EXACTLY,
        POSSIBLY,
        IMPOSSIBLE;

        public boolean a() {
            return this == EXACTLY;
        }

        public boolean c() {
            return this == IMPOSSIBLE;
        }
    }

    private class c {

        /* renamed from: a, reason: collision with root package name */
        private Map f44030a;

        /* renamed from: b, reason: collision with root package name */
        private C6817a f44031b;

        private c() {
            this.f44030a = new HashMap();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g(char c8) {
            this.f44030a.put(Character.valueOf(c8), f.this.new c());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public c h(char c8) {
            return (c) this.f44030a.get(Character.valueOf(c8));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public C6817a i() {
            return this.f44031b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean j(char c8) {
            return this.f44030a.containsKey(Character.valueOf(c8));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean k() {
            return this.f44031b != null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void l(C6817a c6817a) {
            this.f44031b = c6817a;
        }
    }

    public f(Collection collection) {
        Iterator it = collection.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            C6817a c6817a = (C6817a) it.next();
            c cVar = this.f44024a;
            char[] charArray = c6817a.c().toCharArray();
            i8 = Math.max(i8, charArray.length);
            for (char c8 : charArray) {
                if (!cVar.j(c8)) {
                    cVar.g(c8);
                }
                cVar = cVar.h(c8);
            }
            cVar.l(c6817a);
        }
        this.f44025b = i8;
    }

    public C6817a a(String str) {
        return b(str.toCharArray(), 0, str.length());
    }

    C6817a b(char[] cArr, int i8, int i9) {
        if (i8 < 0 || i8 > i9 || i9 > cArr.length) {
            throw new ArrayIndexOutOfBoundsException("start " + i8 + ", end " + i9 + ", length " + cArr.length);
        }
        c cVar = this.f44024a;
        for (int i10 = 0; i10 < i9; i10++) {
            if (!cVar.j(cArr[i10])) {
                return null;
            }
            cVar = cVar.h(cArr[i10]);
        }
        return cVar.i();
    }

    public b c(char[] cArr, int i8, int i9) {
        if (i8 >= 0 && i8 <= i9 && i9 <= cArr.length) {
            c cVar = this.f44024a;
            while (i8 < i9) {
                if (!cVar.j(cArr[i8])) {
                    return b.IMPOSSIBLE;
                }
                cVar = cVar.h(cArr[i8]);
                i8++;
            }
            return cVar.k() ? b.EXACTLY : b.POSSIBLY;
        }
        throw new ArrayIndexOutOfBoundsException("start " + i8 + ", end " + i9 + ", length " + cArr.length);
    }
}
