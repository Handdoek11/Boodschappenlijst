package z0;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* renamed from: z0.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7018c0 {

    /* renamed from: z0.c0$a */
    public static final class a implements R6.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f44735a;

        a(ViewGroup viewGroup) {
            this.f44735a = viewGroup;
        }

        @Override // R6.d
        public Iterator iterator() {
            return AbstractC7018c0.c(this.f44735a);
        }
    }

    /* renamed from: z0.c0$b */
    static final class b extends J6.s implements I6.l {

        /* renamed from: o, reason: collision with root package name */
        public static final b f44736o = new b();

        b() {
            super(1);
        }

        @Override // I6.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Iterator invoke(View view) {
            R6.d a8;
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            if (viewGroup == null || (a8 = AbstractC7018c0.a(viewGroup)) == null) {
                return null;
            }
            return a8.iterator();
        }
    }

    /* renamed from: z0.c0$c */
    public static final class c implements Iterator, K6.a {

        /* renamed from: o, reason: collision with root package name */
        private int f44737o;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ ViewGroup f44738s;

        c(ViewGroup viewGroup) {
            this.f44738s = viewGroup;
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public View next() {
            ViewGroup viewGroup = this.f44738s;
            int i8 = this.f44737o;
            this.f44737o = i8 + 1;
            View childAt = viewGroup.getChildAt(i8);
            if (childAt != null) {
                return childAt;
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f44737o < this.f44738s.getChildCount();
        }

        @Override // java.util.Iterator
        public void remove() {
            ViewGroup viewGroup = this.f44738s;
            int i8 = this.f44737o - 1;
            this.f44737o = i8;
            viewGroup.removeViewAt(i8);
        }
    }

    /* renamed from: z0.c0$d */
    public static final class d implements R6.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f44739a;

        public d(ViewGroup viewGroup) {
            this.f44739a = viewGroup;
        }

        @Override // R6.d
        public Iterator iterator() {
            return new S(AbstractC7018c0.a(this.f44739a).iterator(), b.f44736o);
        }
    }

    public static final R6.d a(ViewGroup viewGroup) {
        return new a(viewGroup);
    }

    public static final R6.d b(ViewGroup viewGroup) {
        return new d(viewGroup);
    }

    public static final Iterator c(ViewGroup viewGroup) {
        return new c(viewGroup);
    }
}
