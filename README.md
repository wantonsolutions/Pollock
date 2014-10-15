Pollock
=======

Abstract git repository analyzer and renderer.

Pollock fuses a repository’s contributors, with the density of their contributions over time. Each of the rendered splatters is representative of an individual file within a repository. The splatters begin as a single point and are drawn across the canvas based on the development history of the file. To give the spatters direction each contributor to a repository will have a vector assigned to them based on the date of their first commit.The direction of the vectors will be determined by taking the total number of contributors, and distributing that many vectors evenly about a point in a circular fashion. The vectors will be assigned to contributors clockwise starting at noon, so in a repository with 100 committers the 1st’s vector would point straight up, and the 25th’s would point right. The direction of the splatter will be determined computing the sum of the vectors of commits made at an instance in history. The diameter of a splatter is determined by the sum of insertions and deletions in recent commits, and is thereby analogous to the amount of work performed within the file. The fusion of these elements will communicate a number of features of the code. The addition of new contributors will cause similar bends within all the splatters, the completion of milestones will propagate through the image as taperings in the splatters. Major refactorings will cause unanimous swells. Moreover different development methods will produce starkly different images. Highly iterative agile projects will render long beaded splatters, in contrast to the large inkblots of waterfall. The driving motivation behind this fusion is to give an impression about the repository at a single glance, while allowing a well-trained eye to determine some subtleties of the development of the code.