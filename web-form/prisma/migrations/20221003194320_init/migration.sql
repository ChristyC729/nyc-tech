-- CreateTable
CREATE TABLE "Courses" (
    "id" SERIAL NOT NULL,
    "classes" TEXT[],

    CONSTRAINT "Courses_pkey" PRIMARY KEY ("id")
);
