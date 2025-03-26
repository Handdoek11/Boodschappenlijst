package G0;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* loaded from: classes.dex */
abstract class b {

    public interface a {
        void a(Object obj, Rect rect);
    }

    /* renamed from: G0.b$b, reason: collision with other inner class name */
    public interface InterfaceC0041b {
        Object a(Object obj, int i8);

        int b(Object obj);
    }

    private static class c implements Comparator {

        /* renamed from: o, reason: collision with root package name */
        private final Rect f2531o = new Rect();

        /* renamed from: s, reason: collision with root package name */
        private final Rect f2532s = new Rect();

        /* renamed from: t, reason: collision with root package name */
        private final boolean f2533t;

        /* renamed from: u, reason: collision with root package name */
        private final a f2534u;

        c(boolean z7, a aVar) {
            this.f2533t = z7;
            this.f2534u = aVar;
        }

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            Rect rect = this.f2531o;
            Rect rect2 = this.f2532s;
            this.f2534u.a(obj, rect);
            this.f2534u.a(obj2, rect2);
            int i8 = rect.top;
            int i9 = rect2.top;
            if (i8 < i9) {
                return -1;
            }
            if (i8 > i9) {
                return 1;
            }
            int i10 = rect.left;
            int i11 = rect2.left;
            if (i10 < i11) {
                return this.f2533t ? 1 : -1;
            }
            if (i10 > i11) {
                return this.f2533t ? -1 : 1;
            }
            int i12 = rect.bottom;
            int i13 = rect2.bottom;
            if (i12 < i13) {
                return -1;
            }
            if (i12 > i13) {
                return 1;
            }
            int i14 = rect.right;
            int i15 = rect2.right;
            if (i14 < i15) {
                return this.f2533t ? 1 : -1;
            }
            if (i14 > i15) {
                return this.f2533t ? -1 : 1;
            }
            return 0;
        }
    }

    private static boolean a(int i8, Rect rect, Rect rect2, Rect rect3) {
        boolean b8 = b(i8, rect, rect2);
        if (b(i8, rect, rect3) || !b8) {
            return false;
        }
        return !j(i8, rect, rect3) || i8 == 17 || i8 == 66 || k(i8, rect, rect2) < m(i8, rect, rect3);
    }

    private static boolean b(int i8, Rect rect, Rect rect2) {
        if (i8 != 17) {
            if (i8 != 33) {
                if (i8 != 66) {
                    if (i8 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    public static Object c(Object obj, InterfaceC0041b interfaceC0041b, a aVar, Object obj2, Rect rect, int i8) {
        Rect rect2 = new Rect(rect);
        if (i8 == 17) {
            rect2.offset(rect.width() + 1, 0);
        } else if (i8 == 33) {
            rect2.offset(0, rect.height() + 1);
        } else if (i8 == 66) {
            rect2.offset(-(rect.width() + 1), 0);
        } else {
            if (i8 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            rect2.offset(0, -(rect.height() + 1));
        }
        int b8 = interfaceC0041b.b(obj);
        Rect rect3 = new Rect();
        Object obj3 = null;
        for (int i9 = 0; i9 < b8; i9++) {
            Object a8 = interfaceC0041b.a(obj, i9);
            if (a8 != obj2) {
                aVar.a(a8, rect3);
                if (h(i8, rect, rect3, rect2)) {
                    rect2.set(rect3);
                    obj3 = a8;
                }
            }
        }
        return obj3;
    }

    public static Object d(Object obj, InterfaceC0041b interfaceC0041b, a aVar, Object obj2, int i8, boolean z7, boolean z8) {
        int b8 = interfaceC0041b.b(obj);
        ArrayList arrayList = new ArrayList(b8);
        for (int i9 = 0; i9 < b8; i9++) {
            arrayList.add(interfaceC0041b.a(obj, i9));
        }
        Collections.sort(arrayList, new c(z7, aVar));
        if (i8 == 1) {
            return f(obj2, arrayList, z8);
        }
        if (i8 == 2) {
            return e(obj2, arrayList, z8);
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
    }

    private static Object e(Object obj, ArrayList arrayList, boolean z7) {
        int size = arrayList.size();
        int lastIndexOf = (obj == null ? -1 : arrayList.lastIndexOf(obj)) + 1;
        if (lastIndexOf < size) {
            return arrayList.get(lastIndexOf);
        }
        if (!z7 || size <= 0) {
            return null;
        }
        return arrayList.get(0);
    }

    private static Object f(Object obj, ArrayList arrayList, boolean z7) {
        int size = arrayList.size();
        int indexOf = (obj == null ? size : arrayList.indexOf(obj)) - 1;
        if (indexOf >= 0) {
            return arrayList.get(indexOf);
        }
        if (!z7 || size <= 0) {
            return null;
        }
        return arrayList.get(size - 1);
    }

    private static int g(int i8, int i9) {
        return (i8 * 13 * i8) + (i9 * i9);
    }

    private static boolean h(int i8, Rect rect, Rect rect2, Rect rect3) {
        if (!i(rect, rect2, i8)) {
            return false;
        }
        if (i(rect, rect3, i8) && !a(i8, rect, rect2, rect3)) {
            return !a(i8, rect, rect3, rect2) && g(k(i8, rect, rect2), o(i8, rect, rect2)) < g(k(i8, rect, rect3), o(i8, rect, rect3));
        }
        return true;
    }

    private static boolean i(Rect rect, Rect rect2, int i8) {
        if (i8 == 17) {
            int i9 = rect.right;
            int i10 = rect2.right;
            return (i9 > i10 || rect.left >= i10) && rect.left > rect2.left;
        }
        if (i8 == 33) {
            int i11 = rect.bottom;
            int i12 = rect2.bottom;
            return (i11 > i12 || rect.top >= i12) && rect.top > rect2.top;
        }
        if (i8 == 66) {
            int i13 = rect.left;
            int i14 = rect2.left;
            return (i13 < i14 || rect.right <= i14) && rect.right < rect2.right;
        }
        if (i8 != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i15 = rect.top;
        int i16 = rect2.top;
        return (i15 < i16 || rect.bottom <= i16) && rect.bottom < rect2.bottom;
    }

    private static boolean j(int i8, Rect rect, Rect rect2) {
        if (i8 == 17) {
            return rect.left >= rect2.right;
        }
        if (i8 == 33) {
            return rect.top >= rect2.bottom;
        }
        if (i8 == 66) {
            return rect.right <= rect2.left;
        }
        if (i8 == 130) {
            return rect.bottom <= rect2.top;
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    }

    private static int k(int i8, Rect rect, Rect rect2) {
        return Math.max(0, l(i8, rect, rect2));
    }

    private static int l(int i8, Rect rect, Rect rect2) {
        int i9;
        int i10;
        if (i8 == 17) {
            i9 = rect.left;
            i10 = rect2.right;
        } else if (i8 == 33) {
            i9 = rect.top;
            i10 = rect2.bottom;
        } else if (i8 == 66) {
            i9 = rect2.left;
            i10 = rect.right;
        } else {
            if (i8 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i9 = rect2.top;
            i10 = rect.bottom;
        }
        return i9 - i10;
    }

    private static int m(int i8, Rect rect, Rect rect2) {
        return Math.max(1, n(i8, rect, rect2));
    }

    private static int n(int i8, Rect rect, Rect rect2) {
        int i9;
        int i10;
        if (i8 == 17) {
            i9 = rect.left;
            i10 = rect2.left;
        } else if (i8 == 33) {
            i9 = rect.top;
            i10 = rect2.top;
        } else if (i8 == 66) {
            i9 = rect2.right;
            i10 = rect.right;
        } else {
            if (i8 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i9 = rect2.bottom;
            i10 = rect.bottom;
        }
        return i9 - i10;
    }

    private static int o(int i8, Rect rect, Rect rect2) {
        if (i8 != 17) {
            if (i8 != 33) {
                if (i8 != 66) {
                    if (i8 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs((rect.left + (rect.width() / 2)) - (rect2.left + (rect2.width() / 2)));
        }
        return Math.abs((rect.top + (rect.height() / 2)) - (rect2.top + (rect2.height() / 2)));
    }
}
