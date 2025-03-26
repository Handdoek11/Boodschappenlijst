package h;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.appcompat.widget.W;
import androidx.vectordrawable.graphics.drawable.h;
import h.AbstractC5819b;
import h.AbstractC5821d;
import i.AbstractC5845a;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p0.k;
import q.C6404h;
import q.C6408l;

/* renamed from: h.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5818a extends AbstractC5821d {

    /* renamed from: F, reason: collision with root package name */
    private c f36114F;

    /* renamed from: G, reason: collision with root package name */
    private g f36115G;

    /* renamed from: H, reason: collision with root package name */
    private int f36116H;

    /* renamed from: I, reason: collision with root package name */
    private int f36117I;

    /* renamed from: J, reason: collision with root package name */
    private boolean f36118J;

    /* renamed from: h.a$b */
    private static class b extends g {

        /* renamed from: a, reason: collision with root package name */
        private final Animatable f36119a;

        b(Animatable animatable) {
            super();
            this.f36119a = animatable;
        }

        @Override // h.C5818a.g
        public void c() {
            this.f36119a.start();
        }

        @Override // h.C5818a.g
        public void d() {
            this.f36119a.stop();
        }
    }

    /* renamed from: h.a$c */
    static class c extends AbstractC5821d.a {

        /* renamed from: K, reason: collision with root package name */
        C6404h f36120K;

        /* renamed from: L, reason: collision with root package name */
        C6408l f36121L;

        c(c cVar, C5818a c5818a, Resources resources) {
            super(cVar, c5818a, resources);
            if (cVar != null) {
                this.f36120K = cVar.f36120K;
                this.f36121L = cVar.f36121L;
            } else {
                this.f36120K = new C6404h();
                this.f36121L = new C6408l();
            }
        }

        private static long D(int i8, int i9) {
            return i9 | (i8 << 32);
        }

        int B(int[] iArr, Drawable drawable, int i8) {
            int z7 = super.z(iArr, drawable);
            this.f36121L.p(z7, Integer.valueOf(i8));
            return z7;
        }

        int C(int i8, int i9, Drawable drawable, boolean z7) {
            int a8 = super.a(drawable);
            long D7 = D(i8, i9);
            long j8 = z7 ? 8589934592L : 0L;
            long j9 = a8;
            this.f36120K.b(D7, Long.valueOf(j9 | j8));
            if (z7) {
                this.f36120K.b(D(i9, i8), Long.valueOf(4294967296L | j9 | j8));
            }
            return a8;
        }

        int E(int i8) {
            if (i8 < 0) {
                return 0;
            }
            return ((Integer) this.f36121L.i(i8, 0)).intValue();
        }

        int F(int[] iArr) {
            int A7 = super.A(iArr);
            return A7 >= 0 ? A7 : super.A(StateSet.WILD_CARD);
        }

        int G(int i8, int i9) {
            return (int) ((Long) this.f36120K.i(D(i8, i9), -1L)).longValue();
        }

        boolean H(int i8, int i9) {
            return (((Long) this.f36120K.i(D(i8, i9), -1L)).longValue() & 4294967296L) != 0;
        }

        boolean I(int i8, int i9) {
            return (((Long) this.f36120K.i(D(i8, i9), -1L)).longValue() & 8589934592L) != 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new C5818a(this, null);
        }

        @Override // h.AbstractC5821d.a, h.AbstractC5819b.d
        void r() {
            this.f36120K = this.f36120K.clone();
            this.f36121L = this.f36121L.clone();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new C5818a(this, resources);
        }
    }

    /* renamed from: h.a$d */
    private static class d extends g {

        /* renamed from: a, reason: collision with root package name */
        private final androidx.vectordrawable.graphics.drawable.c f36122a;

        d(androidx.vectordrawable.graphics.drawable.c cVar) {
            super();
            this.f36122a = cVar;
        }

        @Override // h.C5818a.g
        public void c() {
            this.f36122a.start();
        }

        @Override // h.C5818a.g
        public void d() {
            this.f36122a.stop();
        }
    }

    /* renamed from: h.a$e */
    private static class e extends g {

        /* renamed from: a, reason: collision with root package name */
        private final ObjectAnimator f36123a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f36124b;

        e(AnimationDrawable animationDrawable, boolean z7, boolean z8) {
            super();
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i8 = z7 ? numberOfFrames - 1 : 0;
            int i9 = z7 ? 0 : numberOfFrames - 1;
            f fVar = new f(animationDrawable, z7);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i8, i9);
            ofInt.setAutoCancel(true);
            ofInt.setDuration(fVar.a());
            ofInt.setInterpolator(fVar);
            this.f36124b = z8;
            this.f36123a = ofInt;
        }

        @Override // h.C5818a.g
        public boolean a() {
            return this.f36124b;
        }

        @Override // h.C5818a.g
        public void b() {
            this.f36123a.reverse();
        }

        @Override // h.C5818a.g
        public void c() {
            this.f36123a.start();
        }

        @Override // h.C5818a.g
        public void d() {
            this.f36123a.cancel();
        }
    }

    /* renamed from: h.a$f */
    private static class f implements TimeInterpolator {

        /* renamed from: a, reason: collision with root package name */
        private int[] f36125a;

        /* renamed from: b, reason: collision with root package name */
        private int f36126b;

        /* renamed from: c, reason: collision with root package name */
        private int f36127c;

        f(AnimationDrawable animationDrawable, boolean z7) {
            b(animationDrawable, z7);
        }

        int a() {
            return this.f36127c;
        }

        int b(AnimationDrawable animationDrawable, boolean z7) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f36126b = numberOfFrames;
            int[] iArr = this.f36125a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f36125a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f36125a;
            int i8 = 0;
            for (int i9 = 0; i9 < numberOfFrames; i9++) {
                int duration = animationDrawable.getDuration(z7 ? (numberOfFrames - i9) - 1 : i9);
                iArr2[i9] = duration;
                i8 += duration;
            }
            this.f36127c = i8;
            return i8;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f8) {
            int i8 = (int) ((f8 * this.f36127c) + 0.5f);
            int i9 = this.f36126b;
            int[] iArr = this.f36125a;
            int i10 = 0;
            while (i10 < i9) {
                int i11 = iArr[i10];
                if (i8 < i11) {
                    break;
                }
                i8 -= i11;
                i10++;
            }
            return (i10 / i9) + (i10 < i9 ? i8 / this.f36127c : 0.0f);
        }
    }

    public C5818a() {
        this(null, null);
    }

    public static C5818a l(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            C5818a c5818a = new C5818a();
            c5818a.m(context, resources, xmlPullParser, attributeSet, theme);
            return c5818a;
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    private void n(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlPullParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth) {
                if (xmlPullParser.getName().equals("item")) {
                    p(context, resources, xmlPullParser, attributeSet, theme);
                } else if (xmlPullParser.getName().equals("transition")) {
                    q(context, resources, xmlPullParser, attributeSet, theme);
                }
            }
        }
    }

    private void o() {
        onStateChange(getState());
    }

    private int p(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int next;
        TypedArray s8 = k.s(resources, theme, attributeSet, i.c.f36286h);
        int resourceId = s8.getResourceId(i.c.f36287i, 0);
        int resourceId2 = s8.getResourceId(i.c.f36288j, -1);
        Drawable j8 = resourceId2 > 0 ? W.h().j(context, resourceId2) : null;
        s8.recycle();
        int[] j9 = j(attributeSet);
        if (j8 == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
            j8 = xmlPullParser.getName().equals("vector") ? h.c(resources, xmlPullParser, attributeSet, theme) : AbstractC5845a.a(resources, xmlPullParser, attributeSet, theme);
        }
        if (j8 != null) {
            return this.f36114F.B(j9, j8, resourceId);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
    }

    private int q(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int next;
        TypedArray s8 = k.s(resources, theme, attributeSet, i.c.f36289k);
        int resourceId = s8.getResourceId(i.c.f36292n, -1);
        int resourceId2 = s8.getResourceId(i.c.f36291m, -1);
        int resourceId3 = s8.getResourceId(i.c.f36290l, -1);
        Drawable j8 = resourceId3 > 0 ? W.h().j(context, resourceId3) : null;
        boolean z7 = s8.getBoolean(i.c.f36293o, false);
        s8.recycle();
        if (j8 == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
            j8 = xmlPullParser.getName().equals("animated-vector") ? androidx.vectordrawable.graphics.drawable.c.b(context, resources, xmlPullParser, attributeSet, theme) : AbstractC5845a.a(resources, xmlPullParser, attributeSet, theme);
        }
        if (j8 == null) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
        }
        if (resourceId != -1 && resourceId2 != -1) {
            return this.f36114F.C(resourceId, resourceId2, j8, z7);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
    }

    private boolean r(int i8) {
        int c8;
        int G7;
        g bVar;
        g gVar = this.f36115G;
        if (gVar == null) {
            c8 = c();
        } else {
            if (i8 == this.f36116H) {
                return true;
            }
            if (i8 == this.f36117I && gVar.a()) {
                gVar.b();
                this.f36116H = this.f36117I;
                this.f36117I = i8;
                return true;
            }
            c8 = this.f36116H;
            gVar.d();
        }
        this.f36115G = null;
        this.f36117I = -1;
        this.f36116H = -1;
        c cVar = this.f36114F;
        int E7 = cVar.E(c8);
        int E8 = cVar.E(i8);
        if (E8 == 0 || E7 == 0 || (G7 = cVar.G(E7, E8)) < 0) {
            return false;
        }
        boolean I7 = cVar.I(E7, E8);
        g(G7);
        Object current = getCurrent();
        if (current instanceof AnimationDrawable) {
            bVar = new e((AnimationDrawable) current, cVar.H(E7, E8), I7);
        } else {
            if (!(current instanceof androidx.vectordrawable.graphics.drawable.c)) {
                if (current instanceof Animatable) {
                    bVar = new b((Animatable) current);
                }
                return false;
            }
            bVar = new d((androidx.vectordrawable.graphics.drawable.c) current);
        }
        bVar.c();
        this.f36115G = bVar;
        this.f36117I = c8;
        this.f36116H = i8;
        return true;
    }

    private void s(TypedArray typedArray) {
        c cVar = this.f36114F;
        cVar.f36154d |= AbstractC5845a.b(typedArray);
        cVar.x(typedArray.getBoolean(i.c.f36282d, cVar.f36159i));
        cVar.t(typedArray.getBoolean(i.c.f36283e, cVar.f36162l));
        cVar.u(typedArray.getInt(i.c.f36284f, cVar.f36142A));
        cVar.v(typedArray.getInt(i.c.f36285g, cVar.f36143B));
        setDither(typedArray.getBoolean(i.c.f36280b, cVar.f36174x));
    }

    @Override // h.AbstractC5821d, h.AbstractC5819b
    void h(AbstractC5819b.d dVar) {
        super.h(dVar);
        if (dVar instanceof c) {
            this.f36114F = (c) dVar;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // h.AbstractC5819b, android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        g gVar = this.f36115G;
        if (gVar != null) {
            gVar.d();
            this.f36115G = null;
            g(this.f36116H);
            this.f36116H = -1;
            this.f36117I = -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // h.AbstractC5819b
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public c b() {
        return new c(this.f36114F, this, null);
    }

    public void m(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray s8 = k.s(resources, theme, attributeSet, i.c.f36279a);
        setVisible(s8.getBoolean(i.c.f36281c, true), true);
        s(s8);
        i(resources);
        s8.recycle();
        n(context, resources, xmlPullParser, attributeSet, theme);
        o();
    }

    @Override // h.AbstractC5821d, h.AbstractC5819b, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f36118J && super.mutate() == this) {
            this.f36114F.r();
            this.f36118J = true;
        }
        return this;
    }

    @Override // h.AbstractC5821d, android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        int F7 = this.f36114F.F(iArr);
        boolean z7 = F7 != c() && (r(F7) || g(F7));
        Drawable current = getCurrent();
        return current != null ? z7 | current.setState(iArr) : z7;
    }

    @Override // h.AbstractC5819b, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z7, boolean z8) {
        boolean visible = super.setVisible(z7, z8);
        g gVar = this.f36115G;
        if (gVar != null && (visible || z8)) {
            if (z7) {
                gVar.c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    C5818a(c cVar, Resources resources) {
        super(null);
        this.f36116H = -1;
        this.f36117I = -1;
        h(new c(cVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* renamed from: h.a$g */
    private static abstract class g {
        private g() {
        }

        public boolean a() {
            return false;
        }

        public abstract void c();

        public abstract void d();

        public void b() {
        }
    }
}
