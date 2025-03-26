package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.M;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: androidx.datastore.preferences.protobuf.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0877a implements M {
    protected int memoizedHashCode = 0;

    /* renamed from: androidx.datastore.preferences.protobuf.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0156a implements M.a {
        protected static void k(Iterable iterable, List list) {
            AbstractC0899x.a(iterable);
            if (!(iterable instanceof B)) {
                if (iterable instanceof W) {
                    list.addAll((Collection) iterable);
                    return;
                } else {
                    l(iterable, list);
                    return;
                }
            }
            List h8 = ((B) iterable).h();
            B b8 = (B) list;
            int size = list.size();
            for (Object obj : h8) {
                if (obj == null) {
                    String str = "Element at index " + (b8.size() - size) + " is null.";
                    for (int size2 = b8.size() - 1; size2 >= size; size2--) {
                        b8.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof AbstractC0883g) {
                    b8.M((AbstractC0883g) obj);
                } else {
                    b8.add((String) obj);
                }
            }
        }

        private static void l(Iterable iterable, List list) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size = list.size();
            for (Object obj : iterable) {
                if (obj == null) {
                    String str = "Element at index " + (list.size() - size) + " is null.";
                    for (int size2 = list.size() - 1; size2 >= size; size2--) {
                        list.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                list.add(obj);
            }
        }

        protected static UninitializedMessageException q(M m8) {
            return new UninitializedMessageException(m8);
        }

        protected abstract AbstractC0156a m(AbstractC0877a abstractC0877a);

        @Override // androidx.datastore.preferences.protobuf.M.a
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public AbstractC0156a g(M m8) {
            if (c().getClass().isInstance(m8)) {
                return m((AbstractC0877a) m8);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
    }

    protected static void a(Iterable iterable, List list) {
        AbstractC0156a.k(iterable, list);
    }

    abstract int d();

    int e(c0 c0Var) {
        int d8 = d();
        if (d8 != -1) {
            return d8;
        }
        int g8 = c0Var.g(this);
        l(g8);
        return g8;
    }

    UninitializedMessageException k() {
        return new UninitializedMessageException(this);
    }

    abstract void l(int i8);

    public void m(OutputStream outputStream) {
        CodedOutputStream Z7 = CodedOutputStream.Z(outputStream, CodedOutputStream.C(b()));
        h(Z7);
        Z7.W();
    }
}
