package x0;

import java.util.Locale;

/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final n f44410a = new e(null, false);

    /* renamed from: b, reason: collision with root package name */
    public static final n f44411b = new e(null, true);

    /* renamed from: c, reason: collision with root package name */
    public static final n f44412c;

    /* renamed from: d, reason: collision with root package name */
    public static final n f44413d;

    /* renamed from: e, reason: collision with root package name */
    public static final n f44414e;

    /* renamed from: f, reason: collision with root package name */
    public static final n f44415f;

    private static class a implements c {

        /* renamed from: b, reason: collision with root package name */
        static final a f44416b = new a(true);

        /* renamed from: a, reason: collision with root package name */
        private final boolean f44417a;

        private a(boolean z7) {
            this.f44417a = z7;
        }

        @Override // x0.o.c
        public int a(CharSequence charSequence, int i8, int i9) {
            int i10 = i9 + i8;
            boolean z7 = false;
            while (i8 < i10) {
                int a8 = o.a(Character.getDirectionality(charSequence.charAt(i8)));
                if (a8 != 0) {
                    if (a8 != 1) {
                        continue;
                        i8++;
                        z7 = z7;
                    } else if (!this.f44417a) {
                        return 1;
                    }
                } else if (this.f44417a) {
                    return 0;
                }
                z7 = true;
                i8++;
                z7 = z7;
            }
            if (z7) {
                return this.f44417a ? 1 : 0;
            }
            return 2;
        }
    }

    private static class b implements c {

        /* renamed from: a, reason: collision with root package name */
        static final b f44418a = new b();

        private b() {
        }

        @Override // x0.o.c
        public int a(CharSequence charSequence, int i8, int i9) {
            int i10 = i9 + i8;
            int i11 = 2;
            while (i8 < i10 && i11 == 2) {
                i11 = o.b(Character.getDirectionality(charSequence.charAt(i8)));
                i8++;
            }
            return i11;
        }
    }

    private interface c {
        int a(CharSequence charSequence, int i8, int i9);
    }

    private static abstract class d implements n {

        /* renamed from: a, reason: collision with root package name */
        private final c f44419a;

        d(c cVar) {
            this.f44419a = cVar;
        }

        private boolean c(CharSequence charSequence, int i8, int i9) {
            int a8 = this.f44419a.a(charSequence, i8, i9);
            if (a8 == 0) {
                return true;
            }
            if (a8 != 1) {
                return b();
            }
            return false;
        }

        @Override // x0.n
        public boolean a(CharSequence charSequence, int i8, int i9) {
            if (charSequence == null || i8 < 0 || i9 < 0 || charSequence.length() - i9 < i8) {
                throw new IllegalArgumentException();
            }
            return this.f44419a == null ? b() : c(charSequence, i8, i9);
        }

        protected abstract boolean b();
    }

    private static class e extends d {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f44420b;

        e(c cVar, boolean z7) {
            super(cVar);
            this.f44420b = z7;
        }

        @Override // x0.o.d
        protected boolean b() {
            return this.f44420b;
        }
    }

    private static class f extends d {

        /* renamed from: b, reason: collision with root package name */
        static final f f44421b = new f();

        f() {
            super(null);
        }

        @Override // x0.o.d
        protected boolean b() {
            return p.a(Locale.getDefault()) == 1;
        }
    }

    static {
        b bVar = b.f44418a;
        f44412c = new e(bVar, false);
        f44413d = new e(bVar, true);
        f44414e = new e(a.f44416b, false);
        f44415f = f.f44421b;
    }

    static int a(int i8) {
        if (i8 != 0) {
            return (i8 == 1 || i8 == 2) ? 0 : 2;
        }
        return 1;
    }

    static int b(int i8) {
        if (i8 != 0) {
            if (i8 == 1 || i8 == 2) {
                return 0;
            }
            switch (i8) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
