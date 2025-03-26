package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import androidx.emoji2.text.f;
import androidx.emoji2.text.n;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
final class i {

    /* renamed from: a, reason: collision with root package name */
    private final f.j f9658a;

    /* renamed from: b, reason: collision with root package name */
    private final n f9659b;

    /* renamed from: c, reason: collision with root package name */
    private f.e f9660c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f9661d;

    /* renamed from: e, reason: collision with root package name */
    private final int[] f9662e;

    private static final class a {
        static int a(CharSequence charSequence, int i8, int i9) {
            int length = charSequence.length();
            if (i8 < 0 || length < i8 || i9 < 0) {
                return -1;
            }
            while (true) {
                boolean z7 = false;
                while (i9 != 0) {
                    i8--;
                    if (i8 < 0) {
                        return z7 ? -1 : 0;
                    }
                    char charAt = charSequence.charAt(i8);
                    if (z7) {
                        if (!Character.isHighSurrogate(charAt)) {
                            return -1;
                        }
                        i9--;
                    } else if (!Character.isSurrogate(charAt)) {
                        i9--;
                    } else {
                        if (Character.isHighSurrogate(charAt)) {
                            return -1;
                        }
                        z7 = true;
                    }
                }
                return i8;
            }
        }

        static int b(CharSequence charSequence, int i8, int i9) {
            int length = charSequence.length();
            if (i8 < 0 || length < i8 || i9 < 0) {
                return -1;
            }
            while (true) {
                boolean z7 = false;
                while (i9 != 0) {
                    if (i8 >= length) {
                        if (z7) {
                            return -1;
                        }
                        return length;
                    }
                    char charAt = charSequence.charAt(i8);
                    if (z7) {
                        if (!Character.isLowSurrogate(charAt)) {
                            return -1;
                        }
                        i9--;
                        i8++;
                    } else if (!Character.isSurrogate(charAt)) {
                        i9--;
                        i8++;
                    } else {
                        if (Character.isLowSurrogate(charAt)) {
                            return -1;
                        }
                        i8++;
                        z7 = true;
                    }
                }
                return i8;
            }
        }
    }

    private static class b implements c {

        /* renamed from: a, reason: collision with root package name */
        public t f9663a;

        /* renamed from: b, reason: collision with root package name */
        private final f.j f9664b;

        b(t tVar, f.j jVar) {
            this.f9663a = tVar;
            this.f9664b = jVar;
        }

        @Override // androidx.emoji2.text.i.c
        public boolean b(CharSequence charSequence, int i8, int i9, p pVar) {
            if (pVar.k()) {
                return true;
            }
            if (this.f9663a == null) {
                this.f9663a = new t(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
            }
            this.f9663a.setSpan(this.f9664b.a(pVar), i8, i9, 33);
            return true;
        }

        @Override // androidx.emoji2.text.i.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public t a() {
            return this.f9663a;
        }
    }

    private interface c {
        Object a();

        boolean b(CharSequence charSequence, int i8, int i9, p pVar);
    }

    private static class d implements c {

        /* renamed from: a, reason: collision with root package name */
        private final String f9665a;

        d(String str) {
            this.f9665a = str;
        }

        @Override // androidx.emoji2.text.i.c
        public boolean b(CharSequence charSequence, int i8, int i9, p pVar) {
            if (!TextUtils.equals(charSequence.subSequence(i8, i9), this.f9665a)) {
                return true;
            }
            pVar.l(true);
            return false;
        }

        @Override // androidx.emoji2.text.i.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public d a() {
            return this;
        }
    }

    static final class e {

        /* renamed from: a, reason: collision with root package name */
        private int f9666a = 1;

        /* renamed from: b, reason: collision with root package name */
        private final n.a f9667b;

        /* renamed from: c, reason: collision with root package name */
        private n.a f9668c;

        /* renamed from: d, reason: collision with root package name */
        private n.a f9669d;

        /* renamed from: e, reason: collision with root package name */
        private int f9670e;

        /* renamed from: f, reason: collision with root package name */
        private int f9671f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f9672g;

        /* renamed from: h, reason: collision with root package name */
        private final int[] f9673h;

        e(n.a aVar, boolean z7, int[] iArr) {
            this.f9667b = aVar;
            this.f9668c = aVar;
            this.f9672g = z7;
            this.f9673h = iArr;
        }

        private static boolean d(int i8) {
            return i8 == 65039;
        }

        private static boolean f(int i8) {
            return i8 == 65038;
        }

        private int g() {
            this.f9666a = 1;
            this.f9668c = this.f9667b;
            this.f9671f = 0;
            return 1;
        }

        private boolean h() {
            if (this.f9668c.b().j() || d(this.f9670e)) {
                return true;
            }
            if (this.f9672g) {
                if (this.f9673h == null) {
                    return true;
                }
                if (Arrays.binarySearch(this.f9673h, this.f9668c.b().b(0)) < 0) {
                    return true;
                }
            }
            return false;
        }

        int a(int i8) {
            n.a a8 = this.f9668c.a(i8);
            int i9 = 2;
            if (this.f9666a != 2) {
                if (a8 == null) {
                    i9 = g();
                } else {
                    this.f9666a = 2;
                    this.f9668c = a8;
                    this.f9671f = 1;
                }
            } else if (a8 != null) {
                this.f9668c = a8;
                this.f9671f++;
            } else if (f(i8)) {
                i9 = g();
            } else if (!d(i8)) {
                if (this.f9668c.b() != null) {
                    i9 = 3;
                    if (this.f9671f != 1 || h()) {
                        this.f9669d = this.f9668c;
                        g();
                    } else {
                        i9 = g();
                    }
                } else {
                    i9 = g();
                }
            }
            this.f9670e = i8;
            return i9;
        }

        p b() {
            return this.f9668c.b();
        }

        p c() {
            return this.f9669d.b();
        }

        boolean e() {
            return this.f9666a == 2 && this.f9668c.b() != null && (this.f9671f > 1 || h());
        }
    }

    i(n nVar, f.j jVar, f.e eVar, boolean z7, int[] iArr, Set set) {
        this.f9658a = jVar;
        this.f9659b = nVar;
        this.f9660c = eVar;
        this.f9661d = z7;
        this.f9662e = iArr;
        g(set);
    }

    private static boolean a(Editable editable, KeyEvent keyEvent, boolean z7) {
        j[] jVarArr;
        if (f(keyEvent)) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!e(selectionStart, selectionEnd) && (jVarArr = (j[]) editable.getSpans(selectionStart, selectionEnd, j.class)) != null && jVarArr.length > 0) {
            for (j jVar : jVarArr) {
                int spanStart = editable.getSpanStart(jVar);
                int spanEnd = editable.getSpanEnd(jVar);
                if ((z7 && spanStart == selectionStart) || ((!z7 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    static boolean b(InputConnection inputConnection, Editable editable, int i8, int i9, boolean z7) {
        int max;
        int min;
        if (editable != null && inputConnection != null && i8 >= 0 && i9 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (e(selectionStart, selectionEnd)) {
                return false;
            }
            if (z7) {
                max = a.a(editable, selectionStart, Math.max(i8, 0));
                min = a.b(editable, selectionEnd, Math.max(i9, 0));
                if (max == -1 || min == -1) {
                    return false;
                }
            } else {
                max = Math.max(selectionStart - i8, 0);
                min = Math.min(selectionEnd + i9, editable.length());
            }
            j[] jVarArr = (j[]) editable.getSpans(max, min, j.class);
            if (jVarArr != null && jVarArr.length > 0) {
                for (j jVar : jVarArr) {
                    int spanStart = editable.getSpanStart(jVar);
                    int spanEnd = editable.getSpanEnd(jVar);
                    max = Math.min(spanStart, max);
                    min = Math.max(spanEnd, min);
                }
                int max2 = Math.max(max, 0);
                int min2 = Math.min(min, editable.length());
                inputConnection.beginBatchEdit();
                editable.delete(max2, min2);
                inputConnection.endBatchEdit();
                return true;
            }
        }
        return false;
    }

    static boolean c(Editable editable, int i8, KeyEvent keyEvent) {
        if (!(i8 != 67 ? i8 != 112 ? false : a(editable, keyEvent, true) : a(editable, keyEvent, false))) {
            return false;
        }
        MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        return true;
    }

    private boolean d(CharSequence charSequence, int i8, int i9, p pVar) {
        if (pVar.d() == 0) {
            pVar.m(this.f9660c.a(charSequence, i8, i9, pVar.h()));
        }
        return pVar.d() == 2;
    }

    private static boolean e(int i8, int i9) {
        return i8 == -1 || i9 == -1 || i8 != i9;
    }

    private static boolean f(KeyEvent keyEvent) {
        return !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState());
    }

    private void g(Set set) {
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            i(str, 0, str.length(), 1, true, new d(str));
        }
    }

    private Object i(CharSequence charSequence, int i8, int i9, int i10, boolean z7, c cVar) {
        int i11;
        e eVar = new e(this.f9659b.f(), this.f9661d, this.f9662e);
        int i12 = 0;
        boolean z8 = true;
        int codePointAt = Character.codePointAt(charSequence, i8);
        loop0: while (true) {
            i11 = i8;
            while (i8 < i9 && i12 < i10 && z8) {
                int a8 = eVar.a(codePointAt);
                if (a8 == 1) {
                    i11 += Character.charCount(Character.codePointAt(charSequence, i11));
                    if (i11 < i9) {
                        codePointAt = Character.codePointAt(charSequence, i11);
                    }
                    i8 = i11;
                } else if (a8 == 2) {
                    i8 += Character.charCount(codePointAt);
                    if (i8 < i9) {
                        codePointAt = Character.codePointAt(charSequence, i8);
                    }
                } else if (a8 == 3) {
                    if (z7 || !d(charSequence, i11, i8, eVar.c())) {
                        z8 = cVar.b(charSequence, i11, i8, eVar.c());
                        i12++;
                    }
                }
            }
            break loop0;
        }
        if (eVar.e() && i12 < i10 && z8 && (z7 || !d(charSequence, i11, i8, eVar.b()))) {
            cVar.b(charSequence, i11, i8, eVar.b());
        }
        return cVar.a();
    }

    CharSequence h(CharSequence charSequence, int i8, int i9, int i10, boolean z7) {
        t tVar;
        j[] jVarArr;
        boolean z8 = charSequence instanceof o;
        if (z8) {
            ((o) charSequence).a();
        }
        if (!z8) {
            try {
                tVar = charSequence instanceof Spannable ? new t((Spannable) charSequence) : (!(charSequence instanceof Spanned) || ((Spanned) charSequence).nextSpanTransition(i8 + (-1), i9 + 1, j.class) > i9) ? null : new t(charSequence);
            } finally {
                if (z8) {
                    ((o) charSequence).d();
                }
            }
        }
        if (tVar != null && (jVarArr = (j[]) tVar.getSpans(i8, i9, j.class)) != null && jVarArr.length > 0) {
            for (j jVar : jVarArr) {
                int spanStart = tVar.getSpanStart(jVar);
                int spanEnd = tVar.getSpanEnd(jVar);
                if (spanStart != i9) {
                    tVar.removeSpan(jVar);
                }
                i8 = Math.min(spanStart, i8);
                i9 = Math.max(spanEnd, i9);
            }
        }
        int i11 = i9;
        if (i8 != i11 && i8 < charSequence.length()) {
            if (i10 != Integer.MAX_VALUE && tVar != null) {
                i10 -= ((j[]) tVar.getSpans(0, tVar.length(), j.class)).length;
            }
            t tVar2 = (t) i(charSequence, i8, i11, i10, z7, new b(tVar, this.f9658a));
            if (tVar2 == null) {
                if (z8) {
                    ((o) charSequence).d();
                }
                return charSequence;
            }
            Spannable b8 = tVar2.b();
            if (z8) {
                ((o) charSequence).d();
            }
            return b8;
        }
        return charSequence;
    }
}
