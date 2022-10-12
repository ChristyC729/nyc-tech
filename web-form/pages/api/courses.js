import {PrismaClient} from '@prisma/client'

const prisma = new PrismaClient();

export default async function handler(req, res) {
    if (req.method !== 'POST'){
        return res.status(405).json({message: "Method not allowed"});
    }
    const coursesData = JSON.parse(req.body);
    
    if (!coursesData.includes("calculus")){
        return res.status(404).json({message: "Courses don't contain Calculus"});
    }
    const savedCourses = await prisma.courses.create({
        data: {
            classes: coursesData
        }
    });

    res.status(200).json(savedCourses);
  }