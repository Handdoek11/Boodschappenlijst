package E3;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* loaded from: classes2.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private long f2157a;

    /* renamed from: b, reason: collision with root package name */
    private long f2158b;

    /* renamed from: c, reason: collision with root package name */
    private TimeInterpolator f2159c;

    /* renamed from: d, reason: collision with root package name */
    private int f2160d;

    /* renamed from: e, reason: collision with root package name */
    private int f2161e;

    public g(long j8, long j9) {
        this.f2159c = null;
        this.f2160d = 0;
        this.f2161e = 1;
        this.f2157a = j8;
        this.f2158b = j9;
    }

    static g b(ValueAnimator valueAnimator) {
        g gVar = new g(valueAnimator.getStartDelay(), valueAnimator.getDuration(), f(valueAnimator));
        gVar.f2160d = valueAnimator.getRepeatCount();
        gVar.f2161e = valueAnimator.getRepeatMode();
        return gVar;
    }

    private static TimeInterpolator f(ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        return ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) ? a.f2146b : interpolator instanceof AccelerateInterpolator ? a.f2147c : interpolator instanceof DecelerateInterpolator ? a.f2148d : interpolator;
    }

    public void a(Animator animator) {
        animator.setStartDelay(c());
        animator.setDuration(d());
        animator.setInterpolator(e());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(g());
            valueAnimator.setRepeatMode(h());
        }
    }

    public long c() {
        return this.f2157a;
    }

    public long d() {
        return this.f2158b;
    }

    public TimeInterpolator e() {
        TimeInterpolator timeInterpolator = this.f2159c;
        return timeInterpolator != null ? timeInterpolator : a.f2146b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (c() == gVar.c() && d() == gVar.d() && g() == gVar.g() && h() == gVar.h()) {
            return e().getClass().equals(gVar.e().getClass());
        }
        return false;
    }

    public int g() {
        return this.f2160d;
    }

    public int h() {
        return this.f2161e;
    }

    public int hashCode() {
        return (((((((((int) (c() ^ (c() >>> 32))) * 31) + ((int) (d() ^ (d() >>> 32)))) * 31) + e().getClass().hashCode()) * 31) + g()) * 31) + h();
    }

    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + c() + " duration: " + d() + " interpolator: " + e().getClass() + " repeatCount: " + g() + " repeatMode: " + h() + "}\n";
    }

    public g(long j8, long j9, TimeInterpolator timeInterpolator) {
        this.f2160d = 0;
        this.f2161e = 1;
        this.f2157a = j8;
        this.f2158b = j9;
        this.f2159c = timeInterpolator;
    }
}
