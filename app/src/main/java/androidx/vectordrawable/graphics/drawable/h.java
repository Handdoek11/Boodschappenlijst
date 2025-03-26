package androidx.vectordrawable.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p0.k;
import q.C6397a;
import q0.AbstractC6413d;
import r0.AbstractC6641a;

/* loaded from: classes.dex */
public class h extends androidx.vectordrawable.graphics.drawable.g {

    /* renamed from: B, reason: collision with root package name */
    static final PorterDuff.Mode f11623B = PorterDuff.Mode.SRC_IN;

    /* renamed from: A, reason: collision with root package name */
    private final Rect f11624A;

    /* renamed from: s, reason: collision with root package name */
    private C0193h f11625s;

    /* renamed from: t, reason: collision with root package name */
    private PorterDuffColorFilter f11626t;

    /* renamed from: u, reason: collision with root package name */
    private ColorFilter f11627u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f11628v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f11629w;

    /* renamed from: x, reason: collision with root package name */
    private Drawable.ConstantState f11630x;

    /* renamed from: y, reason: collision with root package name */
    private final float[] f11631y;

    /* renamed from: z, reason: collision with root package name */
    private final Matrix f11632z;

    private static class b extends f {
        b() {
        }

        private void f(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f11659b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f11658a = AbstractC6413d.d(string2);
            }
            this.f11660c = k.k(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        @Override // androidx.vectordrawable.graphics.drawable.h.f
        public boolean c() {
            return true;
        }

        public void e(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (k.r(xmlPullParser, "pathData")) {
                TypedArray s8 = k.s(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f11594d);
                f(s8, xmlPullParser);
                s8.recycle();
            }
        }

        b(b bVar) {
            super(bVar);
        }
    }

    private static abstract class e {
        private e() {
        }

        public boolean a() {
            return false;
        }

        public boolean b(int[] iArr) {
            return false;
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.h$h, reason: collision with other inner class name */
    private static class C0193h extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        int f11679a;

        /* renamed from: b, reason: collision with root package name */
        g f11680b;

        /* renamed from: c, reason: collision with root package name */
        ColorStateList f11681c;

        /* renamed from: d, reason: collision with root package name */
        PorterDuff.Mode f11682d;

        /* renamed from: e, reason: collision with root package name */
        boolean f11683e;

        /* renamed from: f, reason: collision with root package name */
        Bitmap f11684f;

        /* renamed from: g, reason: collision with root package name */
        ColorStateList f11685g;

        /* renamed from: h, reason: collision with root package name */
        PorterDuff.Mode f11686h;

        /* renamed from: i, reason: collision with root package name */
        int f11687i;

        /* renamed from: j, reason: collision with root package name */
        boolean f11688j;

        /* renamed from: k, reason: collision with root package name */
        boolean f11689k;

        /* renamed from: l, reason: collision with root package name */
        Paint f11690l;

        public C0193h(C0193h c0193h) {
            this.f11681c = null;
            this.f11682d = h.f11623B;
            if (c0193h != null) {
                this.f11679a = c0193h.f11679a;
                g gVar = new g(c0193h.f11680b);
                this.f11680b = gVar;
                if (c0193h.f11680b.f11667e != null) {
                    gVar.f11667e = new Paint(c0193h.f11680b.f11667e);
                }
                if (c0193h.f11680b.f11666d != null) {
                    this.f11680b.f11666d = new Paint(c0193h.f11680b.f11666d);
                }
                this.f11681c = c0193h.f11681c;
                this.f11682d = c0193h.f11682d;
                this.f11683e = c0193h.f11683e;
            }
        }

        public boolean a(int i8, int i9) {
            return i8 == this.f11684f.getWidth() && i9 == this.f11684f.getHeight();
        }

        public boolean b() {
            return !this.f11689k && this.f11685g == this.f11681c && this.f11686h == this.f11682d && this.f11688j == this.f11683e && this.f11687i == this.f11680b.getRootAlpha();
        }

        public void c(int i8, int i9) {
            if (this.f11684f == null || !a(i8, i9)) {
                this.f11684f = Bitmap.createBitmap(i8, i9, Bitmap.Config.ARGB_8888);
                this.f11689k = true;
            }
        }

        public void d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f11684f, (Rect) null, rect, e(colorFilter));
        }

        public Paint e(ColorFilter colorFilter) {
            if (!f() && colorFilter == null) {
                return null;
            }
            if (this.f11690l == null) {
                Paint paint = new Paint();
                this.f11690l = paint;
                paint.setFilterBitmap(true);
            }
            this.f11690l.setAlpha(this.f11680b.getRootAlpha());
            this.f11690l.setColorFilter(colorFilter);
            return this.f11690l;
        }

        public boolean f() {
            return this.f11680b.getRootAlpha() < 255;
        }

        public boolean g() {
            return this.f11680b.f();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f11679a;
        }

        public boolean h(int[] iArr) {
            boolean g8 = this.f11680b.g(iArr);
            this.f11689k |= g8;
            return g8;
        }

        public void i() {
            this.f11685g = this.f11681c;
            this.f11686h = this.f11682d;
            this.f11687i = this.f11680b.getRootAlpha();
            this.f11688j = this.f11683e;
            this.f11689k = false;
        }

        public void j(int i8, int i9) {
            this.f11684f.eraseColor(0);
            this.f11680b.b(new Canvas(this.f11684f), i8, i9, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new h(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new h(this);
        }

        public C0193h() {
            this.f11681c = null;
            this.f11682d = h.f11623B;
            this.f11680b = new g();
        }
    }

    h() {
        this.f11629w = true;
        this.f11631y = new float[9];
        this.f11632z = new Matrix();
        this.f11624A = new Rect();
        this.f11625s = new C0193h();
    }

    static int a(int i8, float f8) {
        return (i8 & 16777215) | (((int) (Color.alpha(i8) * f8)) << 24);
    }

    public static h b(Resources resources, int i8, Resources.Theme theme) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            h hVar = new h();
            hVar.f11622o = p0.h.e(resources, i8, theme);
            hVar.f11630x = new i(hVar.f11622o.getConstantState());
            return hVar;
        }
        try {
            XmlResourceParser xml = resources.getXml(i8);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next == 2) {
                return c(resources, xml, asAttributeSet, theme);
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException e8) {
            Log.e("VectorDrawableCompat", "parser error", e8);
            return null;
        } catch (XmlPullParserException e9) {
            Log.e("VectorDrawableCompat", "parser error", e9);
            return null;
        }
    }

    public static h c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        h hVar = new h();
        hVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return hVar;
    }

    private void e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C0193h c0193h = this.f11625s;
        g gVar = c0193h.f11680b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(gVar.f11670h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z7 = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                d dVar = (d) arrayDeque.peek();
                if ("path".equals(name)) {
                    c cVar = new c();
                    cVar.g(resources, attributeSet, theme, xmlPullParser);
                    dVar.f11646b.add(cVar);
                    if (cVar.getPathName() != null) {
                        gVar.f11678p.put(cVar.getPathName(), cVar);
                    }
                    c0193h.f11679a = cVar.f11661d | c0193h.f11679a;
                    z7 = false;
                } else if ("clip-path".equals(name)) {
                    b bVar = new b();
                    bVar.e(resources, attributeSet, theme, xmlPullParser);
                    dVar.f11646b.add(bVar);
                    if (bVar.getPathName() != null) {
                        gVar.f11678p.put(bVar.getPathName(), bVar);
                    }
                    c0193h.f11679a = bVar.f11661d | c0193h.f11679a;
                } else if ("group".equals(name)) {
                    d dVar2 = new d();
                    dVar2.c(resources, attributeSet, theme, xmlPullParser);
                    dVar.f11646b.add(dVar2);
                    arrayDeque.push(dVar2);
                    if (dVar2.getGroupName() != null) {
                        gVar.f11678p.put(dVar2.getGroupName(), dVar2);
                    }
                    c0193h.f11679a = dVar2.f11655k | c0193h.f11679a;
                }
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z7) {
            throw new XmlPullParserException("no path defined");
        }
    }

    private boolean f() {
        return isAutoMirrored() && AbstractC6641a.f(this) == 1;
    }

    private static PorterDuff.Mode g(int i8, PorterDuff.Mode mode) {
        if (i8 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i8 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i8 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i8) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    private void i(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
        C0193h c0193h = this.f11625s;
        g gVar = c0193h.f11680b;
        c0193h.f11682d = g(k.k(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList g8 = k.g(typedArray, xmlPullParser, theme, "tint", 1);
        if (g8 != null) {
            c0193h.f11681c = g8;
        }
        c0193h.f11683e = k.e(typedArray, xmlPullParser, "autoMirrored", 5, c0193h.f11683e);
        gVar.f11673k = k.j(typedArray, xmlPullParser, "viewportWidth", 7, gVar.f11673k);
        float j8 = k.j(typedArray, xmlPullParser, "viewportHeight", 8, gVar.f11674l);
        gVar.f11674l = j8;
        if (gVar.f11673k <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (j8 <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        gVar.f11671i = typedArray.getDimension(3, gVar.f11671i);
        float dimension = typedArray.getDimension(2, gVar.f11672j);
        gVar.f11672j = dimension;
        if (gVar.f11671i <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
        }
        gVar.setAlpha(k.j(typedArray, xmlPullParser, "alpha", 4, gVar.getAlpha()));
        String string = typedArray.getString(0);
        if (string != null) {
            gVar.f11676n = string;
            gVar.f11678p.put(string, gVar);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f11622o;
        if (drawable == null) {
            return false;
        }
        AbstractC6641a.b(drawable);
        return false;
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    Object d(String str) {
        return this.f11625s.f11680b.f11678p.get(str);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f11622o;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f11624A);
        if (this.f11624A.width() <= 0 || this.f11624A.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f11627u;
        if (colorFilter == null) {
            colorFilter = this.f11626t;
        }
        canvas.getMatrix(this.f11632z);
        this.f11632z.getValues(this.f11631y);
        float abs = Math.abs(this.f11631y[0]);
        float abs2 = Math.abs(this.f11631y[4]);
        float abs3 = Math.abs(this.f11631y[1]);
        float abs4 = Math.abs(this.f11631y[3]);
        if (abs3 != 0.0f || abs4 != 0.0f) {
            abs = 1.0f;
            abs2 = 1.0f;
        }
        int min = Math.min(2048, (int) (this.f11624A.width() * abs));
        int min2 = Math.min(2048, (int) (this.f11624A.height() * abs2));
        if (min <= 0 || min2 <= 0) {
            return;
        }
        int save = canvas.save();
        Rect rect = this.f11624A;
        canvas.translate(rect.left, rect.top);
        if (f()) {
            canvas.translate(this.f11624A.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.f11624A.offsetTo(0, 0);
        this.f11625s.c(min, min2);
        if (!this.f11629w) {
            this.f11625s.j(min, min2);
        } else if (!this.f11625s.b()) {
            this.f11625s.j(min, min2);
            this.f11625s.i();
        }
        this.f11625s.d(canvas, colorFilter, this.f11624A);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f11622o;
        return drawable != null ? AbstractC6641a.d(drawable) : this.f11625s.f11680b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f11622o;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f11625s.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f11622o;
        return drawable != null ? AbstractC6641a.e(drawable) : this.f11627u;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f11622o != null && Build.VERSION.SDK_INT >= 24) {
            return new i(this.f11622o.getConstantState());
        }
        this.f11625s.f11679a = getChangingConfigurations();
        return this.f11625s;
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f11622o;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f11625s.f11680b.f11672j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f11622o;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f11625s.f11680b.f11671i;
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f11622o;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    void h(boolean z7) {
        this.f11629w = z7;
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f11622o;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f11622o;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f11622o;
        return drawable != null ? AbstractC6641a.h(drawable) : this.f11625s.f11683e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        C0193h c0193h;
        ColorStateList colorStateList;
        Drawable drawable = this.f11622o;
        return drawable != null ? drawable.isStateful() : super.isStateful() || ((c0193h = this.f11625s) != null && (c0193h.g() || ((colorStateList = this.f11625s.f11681c) != null && colorStateList.isStateful())));
    }

    PorterDuffColorFilter j(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f11622o;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f11628v && super.mutate() == this) {
            this.f11625s = new C0193h(this.f11625s);
            this.f11628v = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f11622o;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean z7;
        PorterDuff.Mode mode;
        Drawable drawable = this.f11622o;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        C0193h c0193h = this.f11625s;
        ColorStateList colorStateList = c0193h.f11681c;
        if (colorStateList == null || (mode = c0193h.f11682d) == null) {
            z7 = false;
        } else {
            this.f11626t = j(this.f11626t, colorStateList, mode);
            invalidateSelf();
            z7 = true;
        }
        if (!c0193h.g() || !c0193h.h(iArr)) {
            return z7;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j8) {
        Drawable drawable = this.f11622o;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j8);
        } else {
            super.scheduleSelf(runnable, j8);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i8) {
        Drawable drawable = this.f11622o;
        if (drawable != null) {
            drawable.setAlpha(i8);
        } else if (this.f11625s.f11680b.getRootAlpha() != i8) {
            this.f11625s.f11680b.setRootAlpha(i8);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z7) {
        Drawable drawable = this.f11622o;
        if (drawable != null) {
            AbstractC6641a.j(drawable, z7);
        } else {
            this.f11625s.f11683e = z7;
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i8) {
        super.setChangingConfigurations(i8);
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i8, PorterDuff.Mode mode) {
        super.setColorFilter(i8, mode);
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z7) {
        super.setFilterBitmap(z7);
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f8, float f9) {
        super.setHotspot(f8, f9);
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i8, int i9, int i10, int i11) {
        super.setHotspotBounds(i8, i9, i10, i11);
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i8) {
        Drawable drawable = this.f11622o;
        if (drawable != null) {
            AbstractC6641a.n(drawable, i8);
        } else {
            setTintList(ColorStateList.valueOf(i8));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f11622o;
        if (drawable != null) {
            AbstractC6641a.o(drawable, colorStateList);
            return;
        }
        C0193h c0193h = this.f11625s;
        if (c0193h.f11681c != colorStateList) {
            c0193h.f11681c = colorStateList;
            this.f11626t = j(this.f11626t, colorStateList, c0193h.f11682d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f11622o;
        if (drawable != null) {
            AbstractC6641a.p(drawable, mode);
            return;
        }
        C0193h c0193h = this.f11625s;
        if (c0193h.f11682d != mode) {
            c0193h.f11682d = mode;
            this.f11626t = j(this.f11626t, c0193h.f11681c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z7, boolean z8) {
        Drawable drawable = this.f11622o;
        return drawable != null ? drawable.setVisible(z7, z8) : super.setVisible(z7, z8);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f11622o;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    private static class i extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        private final Drawable.ConstantState f11691a;

        public i(Drawable.ConstantState constantState) {
            this.f11691a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f11691a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f11691a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            h hVar = new h();
            hVar.f11622o = (VectorDrawable) this.f11691a.newDrawable();
            return hVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            h hVar = new h();
            hVar.f11622o = (VectorDrawable) this.f11691a.newDrawable(resources);
            return hVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            h hVar = new h();
            hVar.f11622o = (VectorDrawable) this.f11691a.newDrawable(resources, theme);
            return hVar;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f11622o;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f11627u = colorFilter;
            invalidateSelf();
        }
    }

    private static abstract class f extends e {

        /* renamed from: a, reason: collision with root package name */
        protected AbstractC6413d.b[] f11658a;

        /* renamed from: b, reason: collision with root package name */
        String f11659b;

        /* renamed from: c, reason: collision with root package name */
        int f11660c;

        /* renamed from: d, reason: collision with root package name */
        int f11661d;

        public f() {
            super();
            this.f11658a = null;
            this.f11660c = 0;
        }

        public boolean c() {
            return false;
        }

        public void d(Path path) {
            path.reset();
            AbstractC6413d.b[] bVarArr = this.f11658a;
            if (bVarArr != null) {
                AbstractC6413d.b.i(bVarArr, path);
            }
        }

        public AbstractC6413d.b[] getPathData() {
            return this.f11658a;
        }

        public String getPathName() {
            return this.f11659b;
        }

        public void setPathData(AbstractC6413d.b[] bVarArr) {
            if (AbstractC6413d.b(this.f11658a, bVarArr)) {
                AbstractC6413d.k(this.f11658a, bVarArr);
            } else {
                this.f11658a = AbstractC6413d.f(bVarArr);
            }
        }

        public f(f fVar) {
            super();
            this.f11658a = null;
            this.f11660c = 0;
            this.f11659b = fVar.f11659b;
            this.f11661d = fVar.f11661d;
            this.f11658a = AbstractC6413d.f(fVar.f11658a);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Drawable drawable = this.f11622o;
        if (drawable != null) {
            AbstractC6641a.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C0193h c0193h = this.f11625s;
        c0193h.f11680b = new g();
        TypedArray s8 = k.s(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f11591a);
        i(s8, xmlPullParser, theme);
        s8.recycle();
        c0193h.f11679a = getChangingConfigurations();
        c0193h.f11689k = true;
        e(resources, xmlPullParser, attributeSet, theme);
        this.f11626t = j(this.f11626t, c0193h.f11681c, c0193h.f11682d);
    }

    h(C0193h c0193h) {
        this.f11629w = true;
        this.f11631y = new float[9];
        this.f11632z = new Matrix();
        this.f11624A = new Rect();
        this.f11625s = c0193h;
        this.f11626t = j(this.f11626t, c0193h.f11681c, c0193h.f11682d);
    }

    private static class c extends f {

        /* renamed from: e, reason: collision with root package name */
        private int[] f11633e;

        /* renamed from: f, reason: collision with root package name */
        p0.d f11634f;

        /* renamed from: g, reason: collision with root package name */
        float f11635g;

        /* renamed from: h, reason: collision with root package name */
        p0.d f11636h;

        /* renamed from: i, reason: collision with root package name */
        float f11637i;

        /* renamed from: j, reason: collision with root package name */
        float f11638j;

        /* renamed from: k, reason: collision with root package name */
        float f11639k;

        /* renamed from: l, reason: collision with root package name */
        float f11640l;

        /* renamed from: m, reason: collision with root package name */
        float f11641m;

        /* renamed from: n, reason: collision with root package name */
        Paint.Cap f11642n;

        /* renamed from: o, reason: collision with root package name */
        Paint.Join f11643o;

        /* renamed from: p, reason: collision with root package name */
        float f11644p;

        c() {
            this.f11635g = 0.0f;
            this.f11637i = 1.0f;
            this.f11638j = 1.0f;
            this.f11639k = 0.0f;
            this.f11640l = 1.0f;
            this.f11641m = 0.0f;
            this.f11642n = Paint.Cap.BUTT;
            this.f11643o = Paint.Join.MITER;
            this.f11644p = 4.0f;
        }

        private Paint.Cap e(int i8, Paint.Cap cap) {
            return i8 != 0 ? i8 != 1 ? i8 != 2 ? cap : Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }

        private Paint.Join f(int i8, Paint.Join join) {
            return i8 != 0 ? i8 != 1 ? i8 != 2 ? join : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER;
        }

        private void h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f11633e = null;
            if (k.r(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f11659b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f11658a = AbstractC6413d.d(string2);
                }
                this.f11636h = k.i(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
                this.f11638j = k.j(typedArray, xmlPullParser, "fillAlpha", 12, this.f11638j);
                this.f11642n = e(k.k(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f11642n);
                this.f11643o = f(k.k(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f11643o);
                this.f11644p = k.j(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f11644p);
                this.f11634f = k.i(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
                this.f11637i = k.j(typedArray, xmlPullParser, "strokeAlpha", 11, this.f11637i);
                this.f11635g = k.j(typedArray, xmlPullParser, "strokeWidth", 4, this.f11635g);
                this.f11640l = k.j(typedArray, xmlPullParser, "trimPathEnd", 6, this.f11640l);
                this.f11641m = k.j(typedArray, xmlPullParser, "trimPathOffset", 7, this.f11641m);
                this.f11639k = k.j(typedArray, xmlPullParser, "trimPathStart", 5, this.f11639k);
                this.f11660c = k.k(typedArray, xmlPullParser, "fillType", 13, this.f11660c);
            }
        }

        @Override // androidx.vectordrawable.graphics.drawable.h.e
        public boolean a() {
            return this.f11636h.i() || this.f11634f.i();
        }

        @Override // androidx.vectordrawable.graphics.drawable.h.e
        public boolean b(int[] iArr) {
            return this.f11634f.j(iArr) | this.f11636h.j(iArr);
        }

        public void g(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray s8 = k.s(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f11593c);
            h(s8, xmlPullParser, theme);
            s8.recycle();
        }

        float getFillAlpha() {
            return this.f11638j;
        }

        int getFillColor() {
            return this.f11636h.e();
        }

        float getStrokeAlpha() {
            return this.f11637i;
        }

        int getStrokeColor() {
            return this.f11634f.e();
        }

        float getStrokeWidth() {
            return this.f11635g;
        }

        float getTrimPathEnd() {
            return this.f11640l;
        }

        float getTrimPathOffset() {
            return this.f11641m;
        }

        float getTrimPathStart() {
            return this.f11639k;
        }

        void setFillAlpha(float f8) {
            this.f11638j = f8;
        }

        void setFillColor(int i8) {
            this.f11636h.k(i8);
        }

        void setStrokeAlpha(float f8) {
            this.f11637i = f8;
        }

        void setStrokeColor(int i8) {
            this.f11634f.k(i8);
        }

        void setStrokeWidth(float f8) {
            this.f11635g = f8;
        }

        void setTrimPathEnd(float f8) {
            this.f11640l = f8;
        }

        void setTrimPathOffset(float f8) {
            this.f11641m = f8;
        }

        void setTrimPathStart(float f8) {
            this.f11639k = f8;
        }

        c(c cVar) {
            super(cVar);
            this.f11635g = 0.0f;
            this.f11637i = 1.0f;
            this.f11638j = 1.0f;
            this.f11639k = 0.0f;
            this.f11640l = 1.0f;
            this.f11641m = 0.0f;
            this.f11642n = Paint.Cap.BUTT;
            this.f11643o = Paint.Join.MITER;
            this.f11644p = 4.0f;
            this.f11633e = cVar.f11633e;
            this.f11634f = cVar.f11634f;
            this.f11635g = cVar.f11635g;
            this.f11637i = cVar.f11637i;
            this.f11636h = cVar.f11636h;
            this.f11660c = cVar.f11660c;
            this.f11638j = cVar.f11638j;
            this.f11639k = cVar.f11639k;
            this.f11640l = cVar.f11640l;
            this.f11641m = cVar.f11641m;
            this.f11642n = cVar.f11642n;
            this.f11643o = cVar.f11643o;
            this.f11644p = cVar.f11644p;
        }
    }

    private static class g {

        /* renamed from: q, reason: collision with root package name */
        private static final Matrix f11662q = new Matrix();

        /* renamed from: a, reason: collision with root package name */
        private final Path f11663a;

        /* renamed from: b, reason: collision with root package name */
        private final Path f11664b;

        /* renamed from: c, reason: collision with root package name */
        private final Matrix f11665c;

        /* renamed from: d, reason: collision with root package name */
        Paint f11666d;

        /* renamed from: e, reason: collision with root package name */
        Paint f11667e;

        /* renamed from: f, reason: collision with root package name */
        private PathMeasure f11668f;

        /* renamed from: g, reason: collision with root package name */
        private int f11669g;

        /* renamed from: h, reason: collision with root package name */
        final d f11670h;

        /* renamed from: i, reason: collision with root package name */
        float f11671i;

        /* renamed from: j, reason: collision with root package name */
        float f11672j;

        /* renamed from: k, reason: collision with root package name */
        float f11673k;

        /* renamed from: l, reason: collision with root package name */
        float f11674l;

        /* renamed from: m, reason: collision with root package name */
        int f11675m;

        /* renamed from: n, reason: collision with root package name */
        String f11676n;

        /* renamed from: o, reason: collision with root package name */
        Boolean f11677o;

        /* renamed from: p, reason: collision with root package name */
        final C6397a f11678p;

        public g() {
            this.f11665c = new Matrix();
            this.f11671i = 0.0f;
            this.f11672j = 0.0f;
            this.f11673k = 0.0f;
            this.f11674l = 0.0f;
            this.f11675m = 255;
            this.f11676n = null;
            this.f11677o = null;
            this.f11678p = new C6397a();
            this.f11670h = new d();
            this.f11663a = new Path();
            this.f11664b = new Path();
        }

        private static float a(float f8, float f9, float f10, float f11) {
            return (f8 * f11) - (f9 * f10);
        }

        private void c(d dVar, Matrix matrix, Canvas canvas, int i8, int i9, ColorFilter colorFilter) {
            dVar.f11645a.set(matrix);
            dVar.f11645a.preConcat(dVar.f11654j);
            canvas.save();
            for (int i10 = 0; i10 < dVar.f11646b.size(); i10++) {
                e eVar = (e) dVar.f11646b.get(i10);
                if (eVar instanceof d) {
                    c((d) eVar, dVar.f11645a, canvas, i8, i9, colorFilter);
                } else if (eVar instanceof f) {
                    d(dVar, (f) eVar, canvas, i8, i9, colorFilter);
                }
            }
            canvas.restore();
        }

        private void d(d dVar, f fVar, Canvas canvas, int i8, int i9, ColorFilter colorFilter) {
            float f8 = i8 / this.f11673k;
            float f9 = i9 / this.f11674l;
            float min = Math.min(f8, f9);
            Matrix matrix = dVar.f11645a;
            this.f11665c.set(matrix);
            this.f11665c.postScale(f8, f9);
            float e8 = e(matrix);
            if (e8 == 0.0f) {
                return;
            }
            fVar.d(this.f11663a);
            Path path = this.f11663a;
            this.f11664b.reset();
            if (fVar.c()) {
                this.f11664b.setFillType(fVar.f11660c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                this.f11664b.addPath(path, this.f11665c);
                canvas.clipPath(this.f11664b);
                return;
            }
            c cVar = (c) fVar;
            float f10 = cVar.f11639k;
            if (f10 != 0.0f || cVar.f11640l != 1.0f) {
                float f11 = cVar.f11641m;
                float f12 = (f10 + f11) % 1.0f;
                float f13 = (cVar.f11640l + f11) % 1.0f;
                if (this.f11668f == null) {
                    this.f11668f = new PathMeasure();
                }
                this.f11668f.setPath(this.f11663a, false);
                float length = this.f11668f.getLength();
                float f14 = f12 * length;
                float f15 = f13 * length;
                path.reset();
                if (f14 > f15) {
                    this.f11668f.getSegment(f14, length, path, true);
                    this.f11668f.getSegment(0.0f, f15, path, true);
                } else {
                    this.f11668f.getSegment(f14, f15, path, true);
                }
                path.rLineTo(0.0f, 0.0f);
            }
            this.f11664b.addPath(path, this.f11665c);
            if (cVar.f11636h.l()) {
                p0.d dVar2 = cVar.f11636h;
                if (this.f11667e == null) {
                    Paint paint = new Paint(1);
                    this.f11667e = paint;
                    paint.setStyle(Paint.Style.FILL);
                }
                Paint paint2 = this.f11667e;
                if (dVar2.h()) {
                    Shader f16 = dVar2.f();
                    f16.setLocalMatrix(this.f11665c);
                    paint2.setShader(f16);
                    paint2.setAlpha(Math.round(cVar.f11638j * 255.0f));
                } else {
                    paint2.setShader(null);
                    paint2.setAlpha(255);
                    paint2.setColor(h.a(dVar2.e(), cVar.f11638j));
                }
                paint2.setColorFilter(colorFilter);
                this.f11664b.setFillType(cVar.f11660c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                canvas.drawPath(this.f11664b, paint2);
            }
            if (cVar.f11634f.l()) {
                p0.d dVar3 = cVar.f11634f;
                if (this.f11666d == null) {
                    Paint paint3 = new Paint(1);
                    this.f11666d = paint3;
                    paint3.setStyle(Paint.Style.STROKE);
                }
                Paint paint4 = this.f11666d;
                Paint.Join join = cVar.f11643o;
                if (join != null) {
                    paint4.setStrokeJoin(join);
                }
                Paint.Cap cap = cVar.f11642n;
                if (cap != null) {
                    paint4.setStrokeCap(cap);
                }
                paint4.setStrokeMiter(cVar.f11644p);
                if (dVar3.h()) {
                    Shader f17 = dVar3.f();
                    f17.setLocalMatrix(this.f11665c);
                    paint4.setShader(f17);
                    paint4.setAlpha(Math.round(cVar.f11637i * 255.0f));
                } else {
                    paint4.setShader(null);
                    paint4.setAlpha(255);
                    paint4.setColor(h.a(dVar3.e(), cVar.f11637i));
                }
                paint4.setColorFilter(colorFilter);
                paint4.setStrokeWidth(cVar.f11635g * min * e8);
                canvas.drawPath(this.f11664b, paint4);
            }
        }

        private float e(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float hypot = (float) Math.hypot(fArr[0], fArr[1]);
            float hypot2 = (float) Math.hypot(fArr[2], fArr[3]);
            float a8 = a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max(hypot, hypot2);
            if (max > 0.0f) {
                return Math.abs(a8) / max;
            }
            return 0.0f;
        }

        public void b(Canvas canvas, int i8, int i9, ColorFilter colorFilter) {
            c(this.f11670h, f11662q, canvas, i8, i9, colorFilter);
        }

        public boolean f() {
            if (this.f11677o == null) {
                this.f11677o = Boolean.valueOf(this.f11670h.a());
            }
            return this.f11677o.booleanValue();
        }

        public boolean g(int[] iArr) {
            return this.f11670h.b(iArr);
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f11675m;
        }

        public void setAlpha(float f8) {
            setRootAlpha((int) (f8 * 255.0f));
        }

        public void setRootAlpha(int i8) {
            this.f11675m = i8;
        }

        public g(g gVar) {
            this.f11665c = new Matrix();
            this.f11671i = 0.0f;
            this.f11672j = 0.0f;
            this.f11673k = 0.0f;
            this.f11674l = 0.0f;
            this.f11675m = 255;
            this.f11676n = null;
            this.f11677o = null;
            C6397a c6397a = new C6397a();
            this.f11678p = c6397a;
            this.f11670h = new d(gVar.f11670h, c6397a);
            this.f11663a = new Path(gVar.f11663a);
            this.f11664b = new Path(gVar.f11664b);
            this.f11671i = gVar.f11671i;
            this.f11672j = gVar.f11672j;
            this.f11673k = gVar.f11673k;
            this.f11674l = gVar.f11674l;
            this.f11669g = gVar.f11669g;
            this.f11675m = gVar.f11675m;
            this.f11676n = gVar.f11676n;
            String str = gVar.f11676n;
            if (str != null) {
                c6397a.put(str, this);
            }
            this.f11677o = gVar.f11677o;
        }
    }

    private static class d extends e {

        /* renamed from: a, reason: collision with root package name */
        final Matrix f11645a;

        /* renamed from: b, reason: collision with root package name */
        final ArrayList f11646b;

        /* renamed from: c, reason: collision with root package name */
        float f11647c;

        /* renamed from: d, reason: collision with root package name */
        private float f11648d;

        /* renamed from: e, reason: collision with root package name */
        private float f11649e;

        /* renamed from: f, reason: collision with root package name */
        private float f11650f;

        /* renamed from: g, reason: collision with root package name */
        private float f11651g;

        /* renamed from: h, reason: collision with root package name */
        private float f11652h;

        /* renamed from: i, reason: collision with root package name */
        private float f11653i;

        /* renamed from: j, reason: collision with root package name */
        final Matrix f11654j;

        /* renamed from: k, reason: collision with root package name */
        int f11655k;

        /* renamed from: l, reason: collision with root package name */
        private int[] f11656l;

        /* renamed from: m, reason: collision with root package name */
        private String f11657m;

        public d(d dVar, C6397a c6397a) {
            f bVar;
            super();
            this.f11645a = new Matrix();
            this.f11646b = new ArrayList();
            this.f11647c = 0.0f;
            this.f11648d = 0.0f;
            this.f11649e = 0.0f;
            this.f11650f = 1.0f;
            this.f11651g = 1.0f;
            this.f11652h = 0.0f;
            this.f11653i = 0.0f;
            Matrix matrix = new Matrix();
            this.f11654j = matrix;
            this.f11657m = null;
            this.f11647c = dVar.f11647c;
            this.f11648d = dVar.f11648d;
            this.f11649e = dVar.f11649e;
            this.f11650f = dVar.f11650f;
            this.f11651g = dVar.f11651g;
            this.f11652h = dVar.f11652h;
            this.f11653i = dVar.f11653i;
            this.f11656l = dVar.f11656l;
            String str = dVar.f11657m;
            this.f11657m = str;
            this.f11655k = dVar.f11655k;
            if (str != null) {
                c6397a.put(str, this);
            }
            matrix.set(dVar.f11654j);
            ArrayList arrayList = dVar.f11646b;
            for (int i8 = 0; i8 < arrayList.size(); i8++) {
                Object obj = arrayList.get(i8);
                if (obj instanceof d) {
                    this.f11646b.add(new d((d) obj, c6397a));
                } else {
                    if (obj instanceof c) {
                        bVar = new c((c) obj);
                    } else {
                        if (!(obj instanceof b)) {
                            throw new IllegalStateException("Unknown object in the tree!");
                        }
                        bVar = new b((b) obj);
                    }
                    this.f11646b.add(bVar);
                    Object obj2 = bVar.f11659b;
                    if (obj2 != null) {
                        c6397a.put(obj2, bVar);
                    }
                }
            }
        }

        private void d() {
            this.f11654j.reset();
            this.f11654j.postTranslate(-this.f11648d, -this.f11649e);
            this.f11654j.postScale(this.f11650f, this.f11651g);
            this.f11654j.postRotate(this.f11647c, 0.0f, 0.0f);
            this.f11654j.postTranslate(this.f11652h + this.f11648d, this.f11653i + this.f11649e);
        }

        private void e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f11656l = null;
            this.f11647c = k.j(typedArray, xmlPullParser, "rotation", 5, this.f11647c);
            this.f11648d = typedArray.getFloat(1, this.f11648d);
            this.f11649e = typedArray.getFloat(2, this.f11649e);
            this.f11650f = k.j(typedArray, xmlPullParser, "scaleX", 3, this.f11650f);
            this.f11651g = k.j(typedArray, xmlPullParser, "scaleY", 4, this.f11651g);
            this.f11652h = k.j(typedArray, xmlPullParser, "translateX", 6, this.f11652h);
            this.f11653i = k.j(typedArray, xmlPullParser, "translateY", 7, this.f11653i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f11657m = string;
            }
            d();
        }

        @Override // androidx.vectordrawable.graphics.drawable.h.e
        public boolean a() {
            for (int i8 = 0; i8 < this.f11646b.size(); i8++) {
                if (((e) this.f11646b.get(i8)).a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.vectordrawable.graphics.drawable.h.e
        public boolean b(int[] iArr) {
            boolean z7 = false;
            for (int i8 = 0; i8 < this.f11646b.size(); i8++) {
                z7 |= ((e) this.f11646b.get(i8)).b(iArr);
            }
            return z7;
        }

        public void c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray s8 = k.s(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f11592b);
            e(s8, xmlPullParser);
            s8.recycle();
        }

        public String getGroupName() {
            return this.f11657m;
        }

        public Matrix getLocalMatrix() {
            return this.f11654j;
        }

        public float getPivotX() {
            return this.f11648d;
        }

        public float getPivotY() {
            return this.f11649e;
        }

        public float getRotation() {
            return this.f11647c;
        }

        public float getScaleX() {
            return this.f11650f;
        }

        public float getScaleY() {
            return this.f11651g;
        }

        public float getTranslateX() {
            return this.f11652h;
        }

        public float getTranslateY() {
            return this.f11653i;
        }

        public void setPivotX(float f8) {
            if (f8 != this.f11648d) {
                this.f11648d = f8;
                d();
            }
        }

        public void setPivotY(float f8) {
            if (f8 != this.f11649e) {
                this.f11649e = f8;
                d();
            }
        }

        public void setRotation(float f8) {
            if (f8 != this.f11647c) {
                this.f11647c = f8;
                d();
            }
        }

        public void setScaleX(float f8) {
            if (f8 != this.f11650f) {
                this.f11650f = f8;
                d();
            }
        }

        public void setScaleY(float f8) {
            if (f8 != this.f11651g) {
                this.f11651g = f8;
                d();
            }
        }

        public void setTranslateX(float f8) {
            if (f8 != this.f11652h) {
                this.f11652h = f8;
                d();
            }
        }

        public void setTranslateY(float f8) {
            if (f8 != this.f11653i) {
                this.f11653i = f8;
                d();
            }
        }

        public d() {
            super();
            this.f11645a = new Matrix();
            this.f11646b = new ArrayList();
            this.f11647c = 0.0f;
            this.f11648d = 0.0f;
            this.f11649e = 0.0f;
            this.f11650f = 1.0f;
            this.f11651g = 1.0f;
            this.f11652h = 0.0f;
            this.f11653i = 0.0f;
            this.f11654j = new Matrix();
            this.f11657m = null;
        }
    }
}
