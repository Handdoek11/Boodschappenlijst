package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p0.k;
import q.C6397a;
import r0.AbstractC6641a;

/* loaded from: classes.dex */
public class c extends g implements Animatable {

    /* renamed from: s, reason: collision with root package name */
    private C0192c f11605s;

    /* renamed from: t, reason: collision with root package name */
    private Context f11606t;

    /* renamed from: u, reason: collision with root package name */
    private ArgbEvaluator f11607u;

    /* renamed from: v, reason: collision with root package name */
    d f11608v;

    /* renamed from: w, reason: collision with root package name */
    private Animator.AnimatorListener f11609w;

    /* renamed from: x, reason: collision with root package name */
    ArrayList f11610x;

    /* renamed from: y, reason: collision with root package name */
    final Drawable.Callback f11611y;

    class a implements Drawable.Callback {
        a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            c.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j8) {
            c.this.scheduleSelf(runnable, j8);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            c.this.unscheduleSelf(runnable);
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ArrayList arrayList = new ArrayList(c.this.f11610x);
            int size = arrayList.size();
            for (int i8 = 0; i8 < size; i8++) {
                ((androidx.vectordrawable.graphics.drawable.b) arrayList.get(i8)).b(c.this);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ArrayList arrayList = new ArrayList(c.this.f11610x);
            int size = arrayList.size();
            for (int i8 = 0; i8 < size; i8++) {
                ((androidx.vectordrawable.graphics.drawable.b) arrayList.get(i8)).c(c.this);
            }
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.c$c, reason: collision with other inner class name */
    private static class C0192c extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        int f11614a;

        /* renamed from: b, reason: collision with root package name */
        h f11615b;

        /* renamed from: c, reason: collision with root package name */
        AnimatorSet f11616c;

        /* renamed from: d, reason: collision with root package name */
        ArrayList f11617d;

        /* renamed from: e, reason: collision with root package name */
        C6397a f11618e;

        public C0192c(Context context, C0192c c0192c, Drawable.Callback callback, Resources resources) {
            if (c0192c != null) {
                this.f11614a = c0192c.f11614a;
                h hVar = c0192c.f11615b;
                if (hVar != null) {
                    Drawable.ConstantState constantState = hVar.getConstantState();
                    if (resources != null) {
                        this.f11615b = (h) constantState.newDrawable(resources);
                    } else {
                        this.f11615b = (h) constantState.newDrawable();
                    }
                    h hVar2 = (h) this.f11615b.mutate();
                    this.f11615b = hVar2;
                    hVar2.setCallback(callback);
                    this.f11615b.setBounds(c0192c.f11615b.getBounds());
                    this.f11615b.h(false);
                }
                ArrayList arrayList = c0192c.f11617d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f11617d = new ArrayList(size);
                    this.f11618e = new C6397a(size);
                    for (int i8 = 0; i8 < size; i8++) {
                        Animator animator = (Animator) c0192c.f11617d.get(i8);
                        Animator clone = animator.clone();
                        String str = (String) c0192c.f11618e.get(animator);
                        clone.setTarget(this.f11615b.d(str));
                        this.f11617d.add(clone);
                        this.f11618e.put(clone, str);
                    }
                    a();
                }
            }
        }

        public void a() {
            if (this.f11616c == null) {
                this.f11616c = new AnimatorSet();
            }
            this.f11616c.playTogether(this.f11617d);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f11614a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    c() {
        this(null, null, null);
    }

    public static c a(Context context, int i8) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            c cVar = new c(context);
            Drawable e8 = p0.h.e(context.getResources(), i8, context.getTheme());
            cVar.f11622o = e8;
            e8.setCallback(cVar.f11611y);
            cVar.f11608v = new d(cVar.f11622o.getConstantState());
            return cVar;
        }
        try {
            XmlResourceParser xml = context.getResources().getXml(i8);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next == 2) {
                return b(context, context.getResources(), xml, asAttributeSet, context.getTheme());
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException e9) {
            Log.e("AnimatedVDCompat", "parser error", e9);
            return null;
        } catch (XmlPullParserException e10) {
            Log.e("AnimatedVDCompat", "parser error", e10);
            return null;
        }
    }

    public static c b(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        c cVar = new c(context);
        cVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return cVar;
    }

    private static void d(AnimatedVectorDrawable animatedVectorDrawable, androidx.vectordrawable.graphics.drawable.b bVar) {
        animatedVectorDrawable.registerAnimationCallback(bVar.a());
    }

    private void e() {
        Animator.AnimatorListener animatorListener = this.f11609w;
        if (animatorListener != null) {
            this.f11605s.f11616c.removeListener(animatorListener);
            this.f11609w = null;
        }
    }

    private void f(String str, Animator animator) {
        animator.setTarget(this.f11605s.f11615b.d(str));
        C0192c c0192c = this.f11605s;
        if (c0192c.f11617d == null) {
            c0192c.f11617d = new ArrayList();
            this.f11605s.f11618e = new C6397a();
        }
        this.f11605s.f11617d.add(animator);
        this.f11605s.f11618e.put(animator, str);
    }

    private static boolean h(AnimatedVectorDrawable animatedVectorDrawable, androidx.vectordrawable.graphics.drawable.b bVar) {
        return animatedVectorDrawable.unregisterAnimationCallback(bVar.a());
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f11622o;
        if (drawable != null) {
            AbstractC6641a.a(drawable, theme);
        }
    }

    public void c(androidx.vectordrawable.graphics.drawable.b bVar) {
        Drawable drawable = this.f11622o;
        if (drawable != null) {
            d((AnimatedVectorDrawable) drawable, bVar);
            return;
        }
        if (bVar == null) {
            return;
        }
        if (this.f11610x == null) {
            this.f11610x = new ArrayList();
        }
        if (this.f11610x.contains(bVar)) {
            return;
        }
        this.f11610x.add(bVar);
        if (this.f11609w == null) {
            this.f11609w = new b();
        }
        this.f11605s.f11616c.addListener(this.f11609w);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f11622o;
        if (drawable != null) {
            return AbstractC6641a.b(drawable);
        }
        return false;
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f11622o;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f11605s.f11615b.draw(canvas);
        if (this.f11605s.f11616c.isStarted()) {
            invalidateSelf();
        }
    }

    public boolean g(androidx.vectordrawable.graphics.drawable.b bVar) {
        Drawable drawable = this.f11622o;
        if (drawable != null) {
            h((AnimatedVectorDrawable) drawable, bVar);
        }
        ArrayList arrayList = this.f11610x;
        if (arrayList == null || bVar == null) {
            return false;
        }
        boolean remove = arrayList.remove(bVar);
        if (this.f11610x.size() == 0) {
            e();
        }
        return remove;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f11622o;
        return drawable != null ? AbstractC6641a.d(drawable) : this.f11605s.f11615b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f11622o;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f11605s.f11614a;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f11622o;
        return drawable != null ? AbstractC6641a.e(drawable) : this.f11605s.f11615b.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f11622o == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new d(this.f11622o.getConstantState());
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f11622o;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f11605s.f11615b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f11622o;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f11605s.f11615b.getIntrinsicWidth();
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
        return drawable != null ? drawable.getOpacity() : this.f11605s.f11615b.getOpacity();
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

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Drawable drawable = this.f11622o;
        if (drawable != null) {
            AbstractC6641a.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray s8 = k.s(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f11595e);
                    int resourceId = s8.getResourceId(0, 0);
                    if (resourceId != 0) {
                        h b8 = h.b(resources, resourceId, theme);
                        b8.h(false);
                        b8.setCallback(this.f11611y);
                        h hVar = this.f11605s.f11615b;
                        if (hVar != null) {
                            hVar.setCallback(null);
                        }
                        this.f11605s.f11615b = b8;
                    }
                    s8.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, androidx.vectordrawable.graphics.drawable.a.f11596f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f11606t;
                        if (context == null) {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        f(string, e.i(context, resourceId2));
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        this.f11605s.a();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f11622o;
        return drawable != null ? AbstractC6641a.h(drawable) : this.f11605s.f11615b.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable = this.f11622o;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f11605s.f11616c.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f11622o;
        return drawable != null ? drawable.isStateful() : this.f11605s.f11615b.isStateful();
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
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f11622o;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f11605s.f11615b.setBounds(rect);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i8) {
        Drawable drawable = this.f11622o;
        return drawable != null ? drawable.setLevel(i8) : this.f11605s.f11615b.setLevel(i8);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f11622o;
        return drawable != null ? drawable.setState(iArr) : this.f11605s.f11615b.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i8) {
        Drawable drawable = this.f11622o;
        if (drawable != null) {
            drawable.setAlpha(i8);
        } else {
            this.f11605s.f11615b.setAlpha(i8);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z7) {
        Drawable drawable = this.f11622o;
        if (drawable != null) {
            AbstractC6641a.j(drawable, z7);
        } else {
            this.f11605s.f11615b.setAutoMirrored(z7);
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
            this.f11605s.f11615b.setTint(i8);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f11622o;
        if (drawable != null) {
            AbstractC6641a.o(drawable, colorStateList);
        } else {
            this.f11605s.f11615b.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f11622o;
        if (drawable != null) {
            AbstractC6641a.p(drawable, mode);
        } else {
            this.f11605s.f11615b.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z7, boolean z8) {
        Drawable drawable = this.f11622o;
        if (drawable != null) {
            return drawable.setVisible(z7, z8);
        }
        this.f11605s.f11615b.setVisible(z7, z8);
        return super.setVisible(z7, z8);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = this.f11622o;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else {
            if (this.f11605s.f11616c.isStarted()) {
                return;
            }
            this.f11605s.f11616c.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = this.f11622o;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f11605s.f11616c.end();
        }
    }

    private c(Context context) {
        this(context, null, null);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f11622o;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f11605s.f11615b.setColorFilter(colorFilter);
        }
    }

    private static class d extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        private final Drawable.ConstantState f11619a;

        public d(Drawable.ConstantState constantState) {
            this.f11619a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f11619a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f11619a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            c cVar = new c();
            Drawable newDrawable = this.f11619a.newDrawable();
            cVar.f11622o = newDrawable;
            newDrawable.setCallback(cVar.f11611y);
            return cVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            c cVar = new c();
            Drawable newDrawable = this.f11619a.newDrawable(resources);
            cVar.f11622o = newDrawable;
            newDrawable.setCallback(cVar.f11611y);
            return cVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            c cVar = new c();
            Drawable newDrawable = this.f11619a.newDrawable(resources, theme);
            cVar.f11622o = newDrawable;
            newDrawable.setCallback(cVar.f11611y);
            return cVar;
        }
    }

    private c(Context context, C0192c c0192c, Resources resources) {
        this.f11607u = null;
        this.f11609w = null;
        this.f11610x = null;
        a aVar = new a();
        this.f11611y = aVar;
        this.f11606t = context;
        if (c0192c != null) {
            this.f11605s = c0192c;
        } else {
            this.f11605s = new C0192c(context, c0192c, aVar, resources);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
